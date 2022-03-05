<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/3/4
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small> 新增书籍 </small>
                </h1>
            </div>
        </div>
    </div>

    <form action="<c:url value="/book/addBook"/>" method="post">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input required name="bookName" type="text" class="form-control" id="bkname">
        </div>
        <div class="form-group">
            <label for="bknum">书籍数量:</label>
            <input required name="bookCounts" type="text" class="form-control" id="bknum">
        </div>
        <div class="form-group">
            <label for="bkdesc">书籍描述:</label>
            <input required name="detail" type="text" class="form-control" id="bkdesc">
        </div>
        <input class="btn btn-danger" type="submit" value="提交">
    </form>
</div>
</body>
</html>
