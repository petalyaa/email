<script type="text/JavaScript">
	var $newBtn = $("#database-new-btn");
	var $newDBModal = $("#add-database-modal");
	var $table = $("#database-table");
	var $deleteBtn = $("#database-del-btn");
	var selectedIds = [];
	loadDatabaseList();
	
	$deleteBtn.unbind("click");
	$deleteBtn.click(function() {
		if(selectedIds.length <= 0) {
			alert("Please select something...");
		} else {
			doDeleteContact(selectedIds.join(","));
			selectedIds = [];
		}
		
	});
	
	function doDeleteContact(ids) {
		var url = 'database?${WebConstants.ACTION_NAME}=${WebConstants.DO_DELETE_DATABASE}';
		app.ajaxCall({url : url, data : {ids : ids}, callbackFn : function(data, textStatus, jqXHR) {
			try {
				var json = $.parseJSON(jqXHR.responseText);
				loadDatabaseList();
			} catch (e) {
			}
				
		}});
	}
	
	function generateDBTR(database) {
		var status = '<fmt:message key="status.inactive" />';
		var type = '<fmt:message key="database.type.subscribe" />';
		if(database.active)
			status = '<fmt:message key="status.active" />';
		if(database.type != '${WebConstants.DATABASE_TYPE_SUBSCRIBE}')
			type = '<fmt:message key="database.type.unsubscribe" />';
		var $tr = $("<tr />");
		var $checkbox = $("<input type='checkbox' name='contact-id' value='" + database.id + "' />");
		var $checkboxTD = $("<td />");
		$checkboxTD.append($checkbox);
		var $idTD = $("<td>"+database.id+"</td>");
		var $aName = $("<a>" + app.shortened(database.name) + "</a>")
		var $nameTD = $("<td />");
		$nameTD.append($aName);
		var $descTD = $("<td>" + app.shortened(database.description) + "</td>");
		var $dateTD = $("<td>" + database.dataCreated + "</td>");
		var $statusTD = $("<td>"+status+"</td>");
		var $typeTD = $("<td>"+type+"</td>");
		var $sizeTD = $("<td>"+database.size+"</td>");
		$tr.append($checkboxTD);
		$tr.append($idTD);
		$tr.append($nameTD);
		$tr.append($descTD);
		$tr.append($dateTD);
		$tr.append($statusTD);
		$tr.append($typeTD);
		$tr.append($sizeTD);
		
		$checkbox.change(function() {
			var id = $(this).val();
			if($(this).is(":checked"))
				selectedIds[selectedIds.length] = id;
			else {
				selectedIds = $.grep(selectedIds, function(value) {
					  return value != id;
				});
			}
		});
		
		return $tr;
	}
	
	function loadDatabaseList() {
		var url = 'database?${WebConstants.ACTION_NAME}=${WebConstants.GET_DATABASE_LIST}';
		app.ajaxCall({url : url, data : null, callbackFn : function(data, textStatus, jqXHR) {
			try {
				var json = $.parseJSON(jqXHR.responseText);
				var databaseList = json.databaseList;
				if(typeof databaseList != 'undefined' && databaseList.length > 0) {
					$table.children("tbody").empty();
					for(var i = 0; i < databaseList.length; i++) {
						var $tr = generateDBTR(databaseList[i]);
						$table.children("tbody").append($tr);
					}
					
					$("input[name=check_all]").unbind('change');
					$("input[name=check_all]").change(function() {
						var $checkbox = $("input[name=contact-id]");
						if($(this).is(":checked")) {
							$checkbox.prop("checked", true);
						} else {
							$checkbox.prop("checked", false);
						}
						$checkbox.change();
					});
					
				}
			} catch (e) {
			}
				
		}});
	}
	
	
	
	$newBtn.unbind("click");
	$newBtn.click(function() {
		var $saveBtn = $("#add-database-save-btn");
		var $inputDesc = $("#database-description");
		var $inputName = $("#database-name");
		var $inputType = $("input[name=database-type]");
		$saveBtn.unbind("click");
		$inputName.val("");
		$inputDesc.val("");
		$inputType.each(function() {
			if($(this).parent("label").hasClass("active")) {
				$(this).parent("label").removeClass("active");
			}
		});
		$saveBtn.click(function() {
			var name = $inputName.val();
			var desc = $inputDesc.val();
			var type = '${WebConstants.DATABASE_TYPE_SUBSCRIBE}';
			$inputType.each(function() {
				if($(this).parent("label").hasClass("active")) {
					type = $(this).val();
				}
			});
			if(name == null || name == '')
				return;
			var data = {name : name, desc : desc, type : type};
			var url = 'database?${WebConstants.ACTION_NAME}=${WebConstants.DO_SAVE_DATABASE}';
			app.ajaxCall({url : url, data : data, callbackFn : function(data, textStatus, jqXHR) {
				loadDatabaseList();
				$newDBModal.modal('hide');
			}});
		});
		$newDBModal.modal();
	});
</script>