<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN"><head>
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

    <link rel="stylesheet" href="/statics/css/ft-carousel.css" />
    <style>
        body{margin: 0;font-family: "微软雅黑";}
        .example {width: 100%;height: 767px;font-size: 40px;text-align: center;background-color: #FF8400;}
        .carousel-item{line-height: 336px;color: #fff;font-family:  Arial Black}
    </style>
</head>


<body><link href="/statics/css/jiathis_share.css" rel="stylesheet" type="text/css">

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


    <!-- 导航 -->
    <%@include file="topTitle.jsp"%>
    <!-- 导航 end -->
</div>
<!-- 头部 end -->

<!-- 导航用到js  首页引用两遍 -->
<script src="/statics/js/slick.js"></script>

<div class="ban-inner" style="background-image: url(/fileImages/bg1.jpg);"></div>
<div class="main">

    <!-- 子导航 -->
    <div class="m-nv">
        <div class="wp">
            <div class="title">赛鸽简介</div>
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=index21">公司简介</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=index22">公司动态</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=index23">赛事动态</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=index24">管理阶层</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=index25">领导寄语</a>
                </li>
            </ul>
            <div class="c"></div>
        </div>
    </div>

    <div class="row-xq">
        <div class="wp">
            <div class="m-text-xq">
                <div class="tit">
                    <h1>领导寄语</h1>
                    <%--<div class="r">
                        <a href="#" onclick="javascript:history.back(-1);" class="ret">返回</a>
                        <div class="m-share">
                            <span class="s1">分享到：</span>
                            <!-- JiaThis Button BEGIN -->
                            <div class="jiathis_style_24x24">
                                <a class="jiathis_button_weixin" title="分享到微信"><span class="jiathis_txt jtico jtico_weixin"></span></a>
                                <a class="jiathis_button_tsina" title="分享到微博"><span class="jiathis_txt jtico jtico_tsina"></span></a>
                                <a class="jiathis_button_cqq" title="分享到QQ好友"><span class="jiathis_txt jtico jtico_cqq"></span></a>
                            </div>
                            <script type="text/javascript" src="/statics/js/jia_002.js" charset="utf-8"></script>
                            <!-- JiaThis Button END -->
                        </div>
                    </div>--%>
                    <div class="date">2017-10-18 13:49:54</div>
                </div>
                <div class="text">
                    <p>企业使命</p>
                    <p></p>
                    <br>
                    <!-- <img src="/Public/home/images/pic5.jpg" alt=""> -->
                </div>
                <%--<div class="pn">
                    <a href="" class="a-prev">没有了</a>
                    <a href="http://www.dreamculture.cn/News/new_list/pid/293/cid/296.html" class="more"></a>
                    <a href="" class="a-next">没有了</a>
                </div>--%>
            </div>
        </div>
    </div>
</div>

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
            <!-- <span>分享</span> -->
            <!-- JiaThis Button BEGIN -->
            <!-- <div class="jiathis_style_32x32">
                <a class="jiathis_button_tsina"></a>
                <a class="jiathis_button_weixin"></a>
                <a class="jiathis_button_cqq"></a>
            </div> -->
            <!-- JiaThis Button END -->
        </div>
        <div class="c"></div>
    </div>
    <div class="copy">
        <div class="wp">
            Copyright©2018 北京赢创技术科技有限公司 版权所有               <%-- <span>技术支持：<a href="">尚品中国</a></span>--%>
        </div>
    </div>
</div>
<!-- 底部 end -->

</body></html>