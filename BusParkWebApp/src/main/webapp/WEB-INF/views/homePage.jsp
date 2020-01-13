<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<title>Home Page</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<%@include file="authheader.jsp" %>	
		<sec:authorize access="hasRole('ADMIN')">
		 	<div class="well">
		 		<a href="<c:url value='/list' />">All Users</a>
		 	</div>
		 	<div class="well">
		 		<a href="<c:url value='/driverslist' />">All Drivers</a>
		 	</div>
		 	<div class="well">
		 		<a href="<c:url value='/buseslist' />">All Buses</a>
		 	</div>
	 	</sec:authorize>
	 	
	 	<sec:authorize access="hasRole('USER')">
		 	<div class="well">
		 		<a href="<c:url value='/buseslist' />">All Buses</a>
		 	</div>
	 	</sec:authorize>
   	</div>
</body>
</html>