<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/8
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%--引入 Bootstrop--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户登录</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/Login" method="post">
        <div>
            <label>用户名：</label>
            <input type="text" name="username" required><br><br><br>
        </div>
        <div>
            <label>密 码：</label>
            <input type="text" name="password" required><br><br><br>
        </div>
        <input type="submit" value="登录">
        <a href="${pageContext.request.contextPath}/user/toRegister">注册</a>

    </form>

</div>

</body>
</html>
