<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
THis is Login Page

<table>
<form action="/auth/login.html" method="post">
<tr>
<td>UserName
</td>
<td><input type="text" name="userName" /> <div>${userName}</div>
</tr>
<tr>
<td>Password
</td>
<td><input type="text" name="password" />
</tr>
<td><input type="submit"/></td>
</form>
</table>
</body>
</html>
