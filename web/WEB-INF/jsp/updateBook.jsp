<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/6/11
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新书籍</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID"  value="${books.bookID}">
        <div>
            <label>书籍名称：</label>
            <input type="text" name="bookName" value="${books.bookName}" required><br><br><br>
        </div>
        <div>
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" value="${books.bookCounts}" required><br><br><br>
        </div>
        <div>
            <label>书籍详情：</label>
            <input type="text" name="detail" value="${books.detail}" required><br><br><br>
        </div>
        <input type="submit" value="修改">
    </form>

</div>
