<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="WebConstants" class="com.pet.email.web.util.WebConstants" scope="request"/>
<div class="row">
	<div class="pull-right">
		<button class="btn btn-primary" type="button" id="database-new-btn">New</button>
		<button class="btn btn-primary" type="button">Import</button>
		<button class="btn btn-danger" type="button" id="database-del-btn">Delete</button>
	</div>
	<span class="clearfix"></span>
	<hr />
	<table class="table table-bordered table-striped" id="database-table">
		<thead>
			<tr>
				<th width="10px"><input type="checkbox" name="check_all" value="1" /></th>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Date Created</th>
				<th>Status</th>
				<th>Type</th>
				<th>Size</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<div class="pull-right">
		<ul class="pagination">
	  		<li><a>&laquo;</a></li>
	  		<li><a>1</a></li>
	  		<li><a>2</a></li>
	  		<li><a>3</a></li>
	  		<li><a>4</a></li>
	  		<li><a>5</a></li>
	  		<li><a>&raquo;</a></li>
		</ul>
	</div>
</div>

<div class="modal fade bs-modal-lg" id="add-database-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
    	<div class="modal-content">
    		<div class="modal-header">
        		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        		<h4 class="modal-title" id="myModalLabel">New Database</h4>
      		</div>
      		<div class="modal-body">
        		<form class="form-horizontal" role="form">
        			<div class="form-group">
    					<label for="database-name" class="col-sm-2 control-label">Name</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" id="database-name" placeholder="Name">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="database-description" class="col-sm-2 control-label">Description</label>
    					<div class="col-sm-10">
      						<textarea rows="5" id="database-description" class="form-control"></textarea>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="database-type" class="col-sm-2 control-label">Type</label>
    					<div class="col-sm-10">
      						<div class="btn-group" data-toggle="buttons">
  								<label class="btn btn-default">
    								<input type="radio" name="database-type" value="${WebConstants.DATABASE_TYPE_SUBSCRIBE}"> Subscription
  								</label>
  								<label class="btn btn-default">
    								<input type="radio" name="database-type" value="${WebConstants.DATABASE_TYPE_UNSUBSCRIBE}"> Unsubscribe
  								</label>
							</div>
    					</div>
  					</div>
        		</form>
      		</div>
      		<div class="modal-footer">
        		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        		<button type="button" class="btn btn-primary" id="add-database-save-btn">Save</button>
      		</div>
    	</div>
    </div>
</div>

<%@ include file="main.js.jsp" %>