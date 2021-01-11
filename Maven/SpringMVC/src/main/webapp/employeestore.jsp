<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Store Details</h1>
<spring:form  action="storeEmployee.spring" method="post" modelAttribute="emp">
<label>Employee Id</label>
	<spring:input path="id"/><br/>
<label>Employee Name</label>
	<spring:input path="name"/><br/>
<label>Employee Id</label>
	<spring:input path="salary"/><br/>
<input type="submit" value="submit">
</spring:form>
</body>
</html>