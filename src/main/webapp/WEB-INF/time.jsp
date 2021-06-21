<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<link href="css/time.css" rel="stylesheet" type="text/css"/>
<script src="js/time.js" type="text/javascript"></script>
<title>Time</title>
</head>
<body>
	<div class="d-flex justify-content-evenly" style="margin-top: 25%;">
		<h1><c:out value="${time}"/></h1>
	</div>
</body>
</html>