<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN"><head>
    <%@include file="basic.jsp" %>
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
        body{margin: 0;font-family: "微软雅黑";background-color: #F1F5F9;}
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

<div class="example">
    <div class="ft-carousel" id="carousel_1">
        <ul class="carousel-inner">

            <c:forEach items="${lunBoTuList}" var="lunBoTu" >
            <%--<li class="carousel-item"><img src="/fileImages/pic3.jpg" /></li>--%>
            <%--<li class="carousel-item"><img src="/fileImages/20171103172347.jpg" /></li>--%>
            <%--<li class="carousel-item"><img src="/fileImages/pic1.jpg" /></li>--%>
            <li class="carousel-item"><img src="${lunBoTu.mediaUrl}" /></li>

            </c:forEach>

        </ul>
    </div>
</div>
<script src="/statics/js/ft-carousel.min.js"></script>
<script type="text/javascript">
    $("#carousel_1").FtCarousel();
</script>



<div class="main" id="projectId">
    <div class="row-a1">
        <div class="g-tit">
            <div class="wp">
                <h2>项目专区</h2>
                <a href="" class="m-more" onclick="alert('正在建设中');"><span>+</span> 更多项目</a>
            </div>
        </div>
        <div class="wp">

                <%--项目专区--%>


                <div class="row">
                    <div class="col-sm-4  col-md-12">

                        <div class="thumbnail col-md-4 ">

                            <a href="${pageContext.request.contextPath}/project/doProjectDetail?projectId=${tmenu1.id}" class="btn btn-primary" role="button">
                            <img src="${project1.mediaUrl}" alt="">
                            <div class="caption">
                                <h3>${tmenu1.menuName}</h3>
                            </div>
                            </a>
                        </div>

                        <div class="thumbnail col-md-4">
                            <a href="${pageContext.request.contextPath}/project/doProjectDetail?projectId=${tmenu2.id}" class="btn btn-primary" role="button">
                                <img src="${project2.mediaUrl}" alt="">
                                <div class="caption">
                                    <h3>${tmenu2.menuName}</h3>
                                </div>
                            </a>
                        </div>

                        <div class="thumbnail col-md-4">
                            <a href="${pageContext.request.contextPath}/project/doProjectDetail?projectId=${tmenu3.id}" class="btn btn-primary" role="button">
                            <img src="${project3.mediaUrl}" alt="">
                            <div class="caption">
                                <h3>${tmenu3.menuName}</h3>
                            </div>
                            </a>
                        </div>


                    </div>


                </div>



        </div>
    </div>
    <div class="row-a2" style="background-color: #f0f4f7;">
        <div class="m-tab">
            <div class="tit">
                <div class="wp">
                        <a href="" class="m-more" onclick="alert('正在建设中');"><span>+</span> 更多项目</a>
                    <ul class="ul-tab TAB_CLICK" id=".tab-show">
                        <li data-href=""><a href="javascript:void(0);">赛事动态</a></li>
                    </ul>
                </div>
            </div>
            <div class="wp">
                <div class="tab-show" style="display: block;">
                    <div class="box-row">
                        <div class="col-l">
                            <%--去做新闻页面，吧新闻主键传递过去--%>
                            <a class="pic"
                               href="${pageContext.request.contextPath}/news/doNewsDetail?newId=${news.newid}">
                                <img src="${raceMedia.mediaUrl}" alt="">
                            </a>
                            <div class="txt">
                                <a target="_blank"
                                   href="${pageContext.request.contextPath}/news/doNewsDetail?newId=${news.newid}">
                                    ${news.title}
                                </a>
                                <p>${news.introduce}</p>
                            </div>
                        </div>

                        <div class="col-r">
                            <ul class="ul-txt">
                                <c:forEach items="${newsList}" var="news1" varStatus="status">
                                <li>
                                    <a target="_blank" href="${pageContext.request.contextPath}/news/doNewsDetail?newId=${news1.newid}">
                                        <div class="num">${status.index+1}</div>
                                        <div class="txt">
                                            <h3>${news1.title}</h3>
                                            <p> ${news1.introduce}</p>
                                            <div >
                                                <fmt:formatDate value="${news1.createDate}" pattern="yyyy-MM-dd"></fmt:formatDate>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--视频专区background-->
    <div class="row-a3" style="background-image: url(/fileImages/pic3.jpg);">
        <div class="g-tit">
            <div class="wp">
                <h2>视频专区</h2>
            </div>
        </div>
        <div class="wp">
            <div class="m-txt">
                <div>&nbsp;</div>

                <div style="text-align: center;">
                    <video controls="controls" poster="${videoPhoto.mediaUrl}"  height="678" width="1200">
                        <source src="${video}" type="video/mp4">你的浏览器不支持此播放器.<br>
                        请直接下载文件: <a href="${video.mediaUrl}">video/mp4</a>
                    </video>
                </div>

                <p>&nbsp;</p>
                <a href="" class="more"><span>+</span> 更多视频</a>
            </div>
        </div>
    </div>
    <div class="row-a4" id="partnergroup">
        <div class="g-tit">
            <div class="wp">
                <h2>协会组织</h2>
                <a href="" class="m-more"><span>+</span> 查看更多</a>
            </div>
        </div>
        <div class="wp">
            <ul class="ul-logo">
                <li><a href=""><img src="/fileImages/img1.jpg" alt=""></a></li>
                <li><a href=""><img src="/fileImages/img2.jpg" alt=""></a></li>
                <li><a href=""><img src="/fileImages/img3.jpg" alt=""></a></li>
                <li><a href=""><img src="/fileImages/img4.jpg" alt=""></a></li>
            </ul>
        </div>
    </div>
    <div class="row-a5" style="background-color: #f0f4f7;">
        <div class="g-tit">
            <div class="wp">
                <h2>赞助商</h2>
                <a href="" class="m-more"><span>+</span> 查看更多</a>
            </div>
        </div>
        <div class="wp">
            <ul class="ul-logo ul2">
                <li><a href=""><img src="/fileImages/img-1.jpg"></a></li>
                <li><a href=""><img src="/fileImages/img-2.jpg"></a></li>
                <li><a href=""><img src="/fileImages/img-3.jpg"></a></li>
                <li><a href=""><img src="/fileImages/img-4.jpg"></a></li>
                <li><a href=""><img src="/fileImages/img-5.jpg"></a></li>
                <li><a href=""><img src="/fileImages/img-6.jpg"/></a></li>
            </ul>
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
            <dt id="contactUs">联系我们</dt>
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
            Copyright©2018 北京赢创技术科技有限公司 版权所有               <%-- <span>技术支持：<a href="">尚品中国</a></span>--%>
        </div>
    </div>
</div>
<!-- 底部 end -->

</body></html>