<%@ page import="loginBean.LoginBean" %><%--
  Created by IntelliJ IDEA.
  User: Zulekha
  Date: 7/22/2020
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
<%
    LoginBean bean=(LoginBean)request.getAttribute("bean");
    out.print("Welcome, "+bean.getName());
%>
</body>
</html>
