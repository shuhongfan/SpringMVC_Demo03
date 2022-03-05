<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/3/5
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>登录页面</h1>

    <%--web-inf下的所有页面或者资源，只能通过controller或者servlet进行访问--%>
    <form action="<c:url value="/user/login"/>" method="post">
        用户名： <input type="text" name="username">
        密码： <input type="text" name="password">
        <input type="submit" value="提交">
    </form>
</body>
</html>
