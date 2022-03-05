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
                    <small> 修改书籍 </small>
                </h1>
            </div>
        </div>
    </div>

    <form action="<c:url value="/book/updateBook"/>" method="post">
        <input type="hidden" name="bookID" value="${Qbook.bookID}">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input required name="bookName" type="text" class="form-control" id="bkname" value="${Qbook.bookName}">
        </div>
        <div class="form-group">
            <label for="bknum">书籍数量:</label>
            <input required name="bookCounts" type="text" class="form-control" id="bknum" value="${Qbook.bookCounts}">
        </div>
        <div class="form-group">
            <label for="bkdesc">书籍描述:</label>
            <input required name="detail" type="text" class="form-control" id="bkdesc" value="${Qbook.detail}">
        </div>
        <input class="btn btn-danger" type="submit" value="修改">
    </form>
</div>
</body>
</html>
