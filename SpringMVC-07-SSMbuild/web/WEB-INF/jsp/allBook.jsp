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
                        <small> 书籍列表  ——————————  显示所有书籍 </small>
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <a class="btn btn-primary" href="<c:url value="/book/toAddPage"/>">新增书籍</a>
                </div>
                <div class="col-md-4">
                    <a class="btn btn-primary" href="<c:url value="/book/allBook"/>">显示全部书籍</a>
                </div>
                <div class="col-md-4">
                    <span style="color: red;font-weight: bold;">${error}</span>
                    <form action="<c:url value="/book/queryBookByName"/>" method="post">
                        <div class="input-group">
                            <input type="text" name="bookName" class="form-control" placeholder="请输入要查询的书籍"/>
                            <span class="input-group-btn">
                                <input class="btn btn-primary" type="submit"/>查询!
                            </span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数量</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                    </thead>

<%--                    数据从数据库中查询出来，从这个list中遍历出来 foreach--%>
                    <tbody>
                        <c:forEach var="book" items="${list}">
                            <tr>
                                <td>${book.bookID}</td>
                                <td>${book.bookName}</td>
                                <td>${book.bookCounts}</td>
                                <td>${book.detail}</td>
                                <td>
                                    <a href="<c:url value="/book/toUpdate?id=${book.bookID}"/>" class="btn btn-danger">修改</a>
                                    <a href="<c:url value="/book/deleteBook/${book.bookID}"/>" class="btn btn-primary">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</body>
</html>
