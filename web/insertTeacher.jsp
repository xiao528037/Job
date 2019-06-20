<%--
  Created by IntelliJ IDEA.
  User: xiangxin
  Date: 2019/6/20
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/updateTeacher" method="post">
        <input type="text" name="id" value="${teacher.id}" hidden="hidden"><br/>
        教师名称:<input type="text" name="name" value="${teacher.teacher_name}"><br/>
        教师年龄: <input type="text" name="age" value="${teacher.teacher_age}">
        <input type="submit" value="提交">
    </form>
</body>
</html>
