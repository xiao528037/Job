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
    <script>
        function chk(id){
            window.location.href="${pageContext.request.contextPath}/deleteTeacher?id="+id;
        }
        function upd(id){
            window.location.href="${pageContext.request.contextPath}/getTeacher?id="+id;
        }
        function add(){
            window.location.href="${pageContext.request.contextPath}/insertTeacher.jsp";
        }
    </script>
</head>
<body>
<form action="servlet/PostBarServlet" method="get" name="postform">
    <table border=1 cellpadding="10" cellspacing="0">
        <tr>
            <td>id</td>
            <td>教师名称</td>
            <td>教师年龄</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${list}" var="post">
            <tr>
                <td>${post.id }</td>
                <td>${post.teacher_name }</td>
                <td>${post.teacher_age }</td>
                <td><input type="button" onclick="chk('${post.id }')" value="删除" ></td>
                <td><input type="button" onclick="upd('${post.id }')" value="修改" ></td>
            </tr>

        </c:forEach>
    </table>
    <input type="button" value="添加" onclick="add()">
</form>
</body>
</html>
