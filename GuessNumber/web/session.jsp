<%@page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<body>
<%
    String name =(String) session.getAttribute("user");
    out.print("Welcome to Guess number "+name);
%>
<% session.setAttribute("message","I am thinking of number between 1 and 100.Guess what it is");
int randomnumber =1+(int)(Math.random()*99);
session.setAttribute("saveNumber",new Integer(randomnumber));
        %>
<h3>Click the link below to go to guess number</h3>
<a href="DBServlet.jsp">guess number</a>
</body>
</html>