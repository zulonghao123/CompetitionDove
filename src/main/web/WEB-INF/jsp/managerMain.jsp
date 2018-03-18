<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="basic.jsp" %>
<head>
    <title>Title</title>
</head>
<body>
<%--固定在顶部--%>

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="" align="center"><h1>欢迎进入后台管理系统</h1></div>
    </div>
</nav>



<div class="container">



    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <ul class="nav nav-pills <%--nav-stacked--%> ">
                <li role="presentation" class="active"><a href="#">主页</a></li>

                <%--信息发布--%>
                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        信息管理 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li role="presentation"><a href="#">公司动态管理</a></li>
                        <li role="presentation"><a href="#">赛事动态管理</a></li>
                        <li role="presentation"><a href="#">协会组织管理</a></li>
                        <li role="presentation"><a href="#">赞助商管理</a></li>
                        <li role="presentation"><a href="#">视频管理</a></li>
                    </ul>
                </li>


                <%--栏目管理下拉框--%>
                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        栏目管理 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li role="presentation"><a href="#">栏目1（修改、删除）</a></li>
                        <li role="presentation"><a href="#">栏目2（修改、删除）</a></li>
                        <li role="presentation"><a href="#">栏目3（修改、删除）</a></li>


                    </ul>
                </li>
                <%--数据查询下拉框--%>

                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        数据查询 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li role="presentation"><a href="#">数据查询（导出）</a></li>
                        <li role="presentation"><a href="#">数据查询（导出）</a></li>
                        <li role="presentation"><a href="#">数据查询（导出）</a></li>

                    </ul>
                </li>
                <%--资料上传下拉框--%>
                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        资料上传 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li role="presentation"><a href="#">资料上传1</a></li>
                        <li role="presentation"><a href="#">资料上传2</a></li>
                        <li role="presentation"><a href="#">资料上传3</a></li>

                    </ul>
                </li>
                <%--查看留言下拉框--%>
                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        查看留言 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li role="presentation"><a href="#">查看留言1</a></li>
                        <li role="presentation"><a href="#">查看留言2</a></li>
                        <li role="presentation"><a href="#">查看留言3</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>


</body>
</html>
