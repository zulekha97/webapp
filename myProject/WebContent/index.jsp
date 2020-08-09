<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="loginServlet" method="post">
<label>Username</label>
<input type="text" name="user"><br>
<label>Password</label>
<input type="password" name="pass"><br>
<button>Login</button>
</form>
</body>
</html>