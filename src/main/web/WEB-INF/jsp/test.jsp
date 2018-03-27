<%--
  Created by IntelliJ IDEA.

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
</head>
<body>

<form id="form1" action="${pageContext.request.contextPath}/race/updateRace" method="post" enctype="multipart/form-data">
            <input type="hidden" name="id" value="1"/>
    赛事名称:<input type="text" name="raceName"/>
    报名价格:<input type="text" name="price"/>
    比赛时间:<input type="text" name="times"/>
    上传赛事信息:<input type="file" name="myFiles"/>

</form>
<button id="submitBtn">提交</button>

<a href="${pageContext.request.contextPath}/race/downLoadRaceFile?id=6">按id下载比赛信息文档</a>

====================================================================<br/>

<a href="${pageContext.request.contextPath}/race/deleteRace?id=1">删除赛事信息</a>
<a href="${pageContext.request.contextPath}/excel/doExcelForApply">打印测试</a>
====================================================================<br/>
<form id="form3" action="${pageContext.request.contextPath}/media/addMediaVideos" method="post" enctype="multipart/form-data">

    媒体名称:<input type="text" name="mediaName"/>
    媒体描述:<input type="text" name="messaage"/>

    媒体文件1:<input type="file" name="myFiles"/>
    媒体文件2:<input type="file" name="myFiles"/>
    媒体文件3:<input type="file" name="myFiles"/>

</form>
<button id="submitBtn2">提交</button>

</body>
<script type="text/javascript">
    $(function () {
        $("#submitBtn").click(function () {
            $("#form1").submit();
        })
        $("#submitBtn1").click(function () {
            $("#form2").submit();
        })
        $("#submitBtn2").click(function () {
            $("#form3").submit();
        })
    })
</script>

</head>
<body>
<form action="${pageContext.request.contextPath}/text/toText" method="post">
    <input type="text" name="phone">
    <input type="submit" value="验证码">
</form>
</body>

</html>
