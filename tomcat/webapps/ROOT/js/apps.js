Apps.prototype.constructor = Apps;

function Apps() {
	
}

Apps.prototype.loadDiv = function(url, $container, data) {
	var parent = this;
	var complete = function(data, textStatus, jqXHR) {
		$container.html(jqXHR.responseText);
	};
	parent.ajaxCall({url : url, data : data, callbackFn : complete, showErrorFn : onError});
	
	function onError() {
		parent.ajaxCall({url : 'error/404.jsp', data : data, callbackFn : complete});
	}
};



Apps.prototype.showLoadingWindow = function(jqXHR, settings,parentThis) {
	// TODO : Show loading window
};

Apps.prototype.hideLoadingWindow = function() {
	// TODO : Hide loading window
};

Apps.prototype.shortened = function(str, length) {
	if(typeof length == 'undefined') {
		length = 20;
	}
	if(length == 0)
		length = str.length - 1;
	if(str.length > length)
		str = str.substring(0, length) + "...";
	return str;
};

Apps.prototype.ajaxCall = function(config) {
	var parent = this;
	var async = true;
	var type = 'GET';
	var url  = '';
	var showLoading = false;
	var beforeSend = null;
	var complete = null;
	var callbackFn = null;
	var showErrorFn = null;
	var data = null;
	if(typeof config != 'undefined') {
		if(typeof config.async != 'undefined') {
			async = config.async;
		}
		if(typeof config.data != 'undefined' && config.data != null) {
			type = 'POST';
			data = config.data;
		}
		if(typeof config.url != 'undefined') {
			url = config.url;
		}
		if(typeof config.showLoading != 'undefined') {
			showLoading = config.showLoading;
		}
		if(typeof config.callbackFn != 'undefined') {
			callbackFn = config.callbackFn;
		}
		if(typeof config.showErrorFn != 'undefined') {
			showErrorFn = config.showErrorFn;
		}
		if(showLoading) {
			beforeSend = function(jqXHR, settings){
				parent.showLoadingWindow(jqXHR, settings,parentThis);
			};
			complete=function (){
				parent.hideLoadingWindow();
			};
		}
	}
	var ajax = $.ajax({  
		  type: type,  
		  url: url,  
		  data: data,
		  beforeSend:beforeSend,
		  complete:complete,
		  success: callbackFn,
		  error: showErrorFn,
		  async : async
	});
	if(!async)
		return ajax.responseText;
};

$(function() {
	var location = window.location.hash;
	if(location == '' || location == null || location == '#')
		window.location.hash = defaultLandingPage;
	else
		load_page_from_hash(location);
	$(window).on('hashchange', function() {
		location = window.location.hash;
		if(location == '' || location==null||location=='#') {
			window.location.hash = defaultLandingPage;
			return;
		}
		load_page_from_hash(location);
	});
});

var app = new Apps();
function load_page_from_hash(hash) {
	$("ul.navbar-nav li").removeClass("active"); // Remove previously active link
	var $link_clicked = $("ul.navbar-nav li a[href='"+hash+"']");
	$link_clicked.parent("li").addClass("active");
	var cleaned_hash = hash.substring(1, hash.length);
	if(cleaned_hash.indexOf("/") > 0) {
		cleaned_hash = cleaned_hash.substring(0, cleaned_hash.indexOf("/"));
		console.log(cleaned_hash);
	}
	var url_to_load = contextPath + '/apps/' + cleaned_hash + '/main.jsp';
	app.loadDiv(url_to_load, $mainContainer);
	
}

