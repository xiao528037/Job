<%--
  Created by IntelliJ IDEA.
  User: xiangxin
  Date: 2019/6/20
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form  method="post" action="${pageContext.request.contextPath}/loginServlet">
        账号:<input type="text" name="username"><br>
        密码:<input type="password" name="password"><br>
        <input type="submit">
    </form>
</center>
</body>
</html>
