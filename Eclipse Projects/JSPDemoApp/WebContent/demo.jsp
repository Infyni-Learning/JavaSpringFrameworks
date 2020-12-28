<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a, b,sum; %>
<%
sum = a+b;
out.println("Welcome to JSP Page");
out.println("Sum of two number is"+sum);
out.println("<br/><font color=red>Sum is "+sum+"</font>");
%>

<font color="blue">Sum of two number is <%=sum %></font>
</body>
</html>