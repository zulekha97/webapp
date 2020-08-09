<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employ page</title>
</head>
<body>
<h1>Add New Passenger</h1>
<form action="savaServlet" method="post">
  <table>
    <tr><td>Full name:</td><td><input type="text" name="fname"/></td></tr>
    <tr><td>Contract:</td><td><input type="number" name="phone"/></td></tr>
    <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
    <tr><td>Age:</td><td><input type="text" name="age"/></td></tr>
    <td> Departure date</td><td><input type="date" name="depature_date"/></tr>
        <td>National ID</td><td><input type="text" name="n_id"/></td></tr>
            <td>username</td><td><input type="text" name="user"/></td></tr>
                <td>Password</td><td><input type="password" name="pass"/></td></tr>
                <td>Origin</td><td><input type="text" name="orgin"/></td></tr>
                <td>Destination</td><td><input type="text" name="destination"/></td></tr>
                <td><input type="radio" value="Male" name="gender">Male
                <input type="radio" name="gender" value="Female">Female</td></tr>
    <tr><td colspan="2"><input type="submit" value="Save employee"/></td></tr>
  </table>
</form>
<br>
<a href="ViewServlet">view passenger</a>


</body>
</html>