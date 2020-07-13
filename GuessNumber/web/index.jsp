
  Created by IntelliJ IDEA.
  User: ZULEKHA
  Date: 12/07/2020
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"   language="java" %>
<html>
  <head>
    <title>Guess Number</title>
  </head>
  <body>
  <%
      String message =(String)session.getAttribute("message");
  %>
 <form action="DBServlet.java" method="post">
     <input type="text" name="guessNumber" size="3">
     <%=message %>
     <input type="submit" value="submit">
 </form>

  <form action="session.jsp" method="post">
     <input type="submit" value="guess number again">
  </form>
  </body>
</html>
