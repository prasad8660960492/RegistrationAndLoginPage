<%@page import="com.techpalle.util.SuccessPage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 SuccessPage sp =(SuccessPage) request.getAttribute("successDetails");
%>
<header>
<h1><%=sp.h1 %></h1>
</header>
<p><%= sp.p %></p>
<footer>
<h3><%= sp.h3 %></h3>
</footer>
</body>
</html>