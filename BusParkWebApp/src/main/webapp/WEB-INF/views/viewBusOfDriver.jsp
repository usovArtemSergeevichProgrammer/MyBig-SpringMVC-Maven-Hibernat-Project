
<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>View Bus</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<%@include file="authheader.jsp"%>

		<div class="well lead">View Bus Form</div>
		<form:form method="POST" modelAttribute="bus" class="form-horizontal">
			<form:input type="hidden" path="uid" id="uid" />

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="regNumber">Reg
						Number</label>
					<div class="col-md-7">
						<form:input type="text" path="regNumber" id="regNumber"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="regNumber" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="model">Model</label>
					<div class="col-md-7">
						<form:input type="text" path="model.name" id="model"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="model.name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="engine">Engine</label>
					<div class="col-md-7">
						<form:input type="text" path="engine.name" id="engine"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="engine.name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="garageNumber">Garage
						Number</label>
					<div class="col-md-7">
						<form:input type="text" path="garageNumber" id="garageNumber"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="garageNumber" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="status">Status</label>
					<div class="col-md-7">
						<form:input type="text" path="status.name" id="status"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="status.name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-actions floatRight">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update"
								class="btn btn-primary btn-sm" /> or <a
								href="<c:url value='/driverslist' />">Go to Drivers List</a>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register"
								class="btn btn-primary btn-sm" /> or <a
								href="<c:url value='/driverslist' />">Go to Drivers List</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</form:form>
	</div>
</body>