<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String user,pass; %>
<%
user = request.getParameter("user");
pass = request.getParameter("pass");
/*
Login ll = new Login();
ll.setUser(user);
ll.setPass(pass);

LoginService ls = new LoginService();
String result = ls.checkUser(ll);
*/

if(user.equals("Ajay") && pass.equals("Kumar")){
	out.println("Successfully Login");
	%>
		<jsp:forward page="home.jsp"></jsp:forward>
	<% 
}else {
	out.println("Failure try once again");
			%>
			<jsp:include page="Login.jsp"></jsp:include>
			<% 
}
%>
</body>
</html>