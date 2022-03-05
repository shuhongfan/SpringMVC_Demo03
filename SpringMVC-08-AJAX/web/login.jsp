<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/3/5
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
<p>
    用户名： <input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码： <input type="password" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
<script>
    function a1() {
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data: {"name":$("#name").val()},
            success:function (data) {
                if (data.toString()=="OK"){
                    $("#userInfo").css("color","green")
                }
                $("#userInfo").text(data)
            }
        })
    }
    
    function a2() {
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data: {"pwd":$("#pwd").val()},
            success:function (data) {
                if (data.toString()=="OK"){
                    $("#pwdInfo").css("color","green")
                }
                $("#pwdInfo").text(data)
            }
        })
    }
</script>
</body>
</html>
