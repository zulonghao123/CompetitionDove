<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>北京梦之兴文化发展有限公司</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0,user-scalable=no">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/statics/css/lib.css">
    <link rel="stylesheet" href="/statics/css/style.css">
    <link rel="stylesheet" href="/statics/css/less.css">
    <script type="text/javascript" src="/statics/js/jquery.js"></script>
    <script type="text/javascript" src="/statics/js/lib.js"></script>
    <script type="text/javascript" src="/statics/js/slick1.min.js"></script>
    <script src="/statics/js/jquery-1.js" type="text/javascript"></script>

    <link rel="stylesheet" href="/statics/css/ft-carousel.css"/>
    <style>
        body {
            margin: 0;
            font-family: "微软雅黑";
        }

        .example {
            width: 100%;
            height: 767px;
            font-size: 40px;
            text-align: center;
            background-color: #FF8400;
        }

        .carousel-item {
            line-height: 336px;
            color: #fff;
            font-family: Arial Black
        }
    </style>
</head>


<body>
<link href="/statics/css/jiathis_share.css" rel="stylesheet" type="text/css">

<!-- 头部 -->
<div class="header">
    <div class="wp">
        <div class="logo">
            <a href="http://www.dreamculture.cn/">
                <img src="/fileImages/201710181346121.png" alt="">
            </a>
        </div>
        <div class="info">全国咨询热线<span>010-25872587 / 25252525</span></div>
        <div class="c"></div>
        <!-- 手机导航触发按钮 -->
        <span class="menuBtn">
            <em class="em1"></em>
            <em class="em2"></em>
            <em class="em3"></em>
        </span>
        <!-- 手机导航触发按钮 end -->
    </div>
    <%@include file="topTitle.jsp" %>
</div>
<!-- 头部 end -->

<!-- 导航用到js  首页引用两遍 -->
<script src="/statics/js/slick.js"></script>

<div class="ban-inner" style="background-image: url(/fileImages/bg1.jpg);"></div>
<div class="main">
    <!-- 子导航 -->


    <h1>
        <div>${news.title}</div>
    </h1>
    <div>${news.newsContent}</div>


    <!-- 底部 -->
    <div class="footer">
        <div class="wp">
            <div class="fd-logo">
                <a href="http://www.dreamculture.cn/">
                    <img src="/fileImages/201710181346121.png" alt="">
                </a>
            </div>
            <div class="qr">
                <div class="q1"><img src="/fileImages/201710181346131.png" alt="">
                    <p>微信公众号</p>
                </div>
                <div class="q2"><img src="/fileImages/201710181346131.png" alt="">
                    <p>官方网站</p>
                </div>
            </div>
            <dl class="dl-nv">
                <dt>免责声明</dt>
                <dd>
                    <a href="">&gt; 法律法规</a>
                    <a href="">&gt; 人才招聘</a>
                    <a href="">&gt; 广告服务</a>
                </dd>
            </dl>
            <dl class="dl-info">
                <dt>联系我们</dt>
                <dd>
                    <p>电话：010-58554852 / 65403834</p>
                    <p>邮箱：1635941948@qq.com</p>
                    <p>地址：北京市朝阳区建国路乙10号（茶家屯南1号院）</p>
                </dd>
            </dl>
            <div class="fd-share">

            </div>
            <div class="c"></div>
        </div>
        <div class="copy">
            <div class="wp">
                Copyright©2018 北京赢创技术科技有限公司 版权所有 <%-- <span>技术支持：<a href="">尚品中国</a></span>--%>
            </div>
        </div>
    </div>
</div>
<!-- 底部 end -->

</body>
</html>