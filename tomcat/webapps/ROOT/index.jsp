<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="WebConstants" class="com.pet.email.web.util.WebConstants" scope="request"/>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title><fmt:message key="application.title" /></title>
		<link type="text/css" rel="Stylesheet" media="all" href="<%= contextPath %>css/bootstrap.min.css" />
		<script type="text/javascript" src="<%= contextPath %>js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="<%= contextPath %>js/bootstrap.min.js"></script>
		<style type="text/css">
			body {
				padding-top: 70px;
			}
			a {
				cursor : pointer;
			}
		</style>
	</head>
	<body>
		<%@ include file="inc/header.inc" %>
		<div class="container" id="main-container"></div>		
	</body>
	<script type="text/javascript">
		var $mainContainer = $("#main-container");
		var defaultLandingPage = '${WebConstants.DEFAULT_LANDING_HASH}';
		var contextPath = '<%= contextPath %>';
	</script>
	<script type="text/javascript" src="<%= contextPath %>js/apps.js"></script>
</html>