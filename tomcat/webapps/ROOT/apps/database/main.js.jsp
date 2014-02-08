<script type="text/JavaScript">
	var $newBtn = $("#database-new-btn");
	var $newDBModal = $("#add-database-modal");
	
	var url = 'database?${WebConstants.ACTION_NAME}=${WebConstants.GET_DATABASE_LIST}';
	app.ajaxCall({url : url, data : null, callbackFn : function(data, textStatus, jqXHR) {
		try {
			var json = $.parseJSON(jqXHR.responseText);
			
		} catch (e) {
		}
			
	}});
	
	
	$newBtn.unbind("click");
	$newBtn.click(function() {
		var $saveBtn = $("#add-database-save-btn");
		var $inputDesc = $("#database-description");
		var $inputName = $("#database-name");
		var $inputType = $("input:radio[name=database-type]:checked")
		$saveBtn.unbind("click");
		$saveBtn.click(function() {
			var name = $inputName.val();
			var desc = $inputDesc.html();
			var type = $inputType.val();
			if(name == null || name == '')
				return;
			var data = {name : name, desc : desc, type : type};
			var url = 'database?${WebConstants.ACTION_NAME}=${WebConstants.DO_SAVE_DATABASE}';
			app.ajaxCall({url : url, data : data, callbackFn : function(data, textStatus, jqXHR) {
				$newDBModal.modal('hide');
			}});
		});
		$newDBModal.modal();
	});
</script>