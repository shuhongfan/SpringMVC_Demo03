<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/3/5
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<input type="button" value="加载数据" id="btn">

  <table border="1">
      <tr>
          <td>姓名</td>
          <td>年龄</td>
          <td>性别</td>
      </tr>
<%--      数据：后台--%>
      <tbody id="content">
        
      </tbody>
  </table>
</body>
<script>
    $("#btn").click(function () {
        $.post("${pageContext.request.contextPath}/a2",function (data) {
            console.log(data)
            var html = ""
            for (let i = 0; i < data.length; i++) {
                html += "<tr><td>"+data[i].name+"</td><td>"+data[i].age+"</td><td>"+data[i].sex+"</td></td>"
            }
            $("#content").html(html)
        })
    })
</script>
</html>
