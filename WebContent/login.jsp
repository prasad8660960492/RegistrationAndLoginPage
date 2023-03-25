<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#ffe6e6">
<form action="logStudent" method="post">
<div align="center"><h1>Welcome to Login Page</h1>
</div>
<div align = "center">
<table>
<tr>
<td><label>Email</label></td>
<td> <input type="email" name="tbemail" placeholder="enter the Email" 
value="<%=request.getParameter("tbemail") %>"/></td>
</tr>

<tr>
<td><label>Password</label></td>

<td><input type="password" name="tbpass" placeholder="enter the Password" 
value="<%=request.getParameter("tbpass") %>"/></td>
</tr>

</table>

<br>
<br>
<br>
<div align="center"><button>login</button></div>
</div>
</form>
</body>

</html>
