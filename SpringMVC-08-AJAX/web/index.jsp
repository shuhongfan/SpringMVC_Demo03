<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/3/5
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
      function a() {
        $.post({
          url:'${pageContext.request.contextPath}/a1',
          data:{
            "name":$("#username").value
          },
          success:function (data) {
            alert(data)
          }
        })
      }

    </script>
  </head>
  <body>
    用户名： <input type="text" id="username" onblur="a()">
  </body>
</html>
