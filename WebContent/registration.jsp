<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#ffe6e6">
<form action="regStudent" method="post">
<div align="center">
<h1>Welcome to Registration Page</h1>
<table>
<tr>
<td>Name :</td>

<td><input type="text" name="tbname" placeholder="enter the Name"/></td>
</tr>

<tr>
<td>EMAIL :</td>
<td> <input type="email" name="tbemail" placeholder="enter the Email"/></td>
</tr>

<tr>
<td>PASSWORD : </td>
<td><input type="password" name="tbpass" placeholder="enter the password"/></td>
</tr>

<tr>
<td>STATES : </td>
<td> <select name="ddlstate">


<option>--select--</option>
<option value="Karnataka">--KA--</option>
<option value="goa">--GOA--</option>
<option value="tamil nadu">--TN--</option>
<option value="maharastra">--MH--</option>
</select>
</td>
</tr>
<br>
<br>
<br>

<br>
<br>

</table>
</div>
<br>
<br>
<br>
<div align="center">
<table>
<tr>
<td ><input type="submit" value="Register"/></td>
</tr>
</table>
</div>
</form>
</body>
</html>