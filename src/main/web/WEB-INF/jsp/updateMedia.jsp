<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/23
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="basic.jsp" %>
</head>
<script type="text/javascript">
    $(function () {
        $("button[name=updateVideo]").click(function () {
            var videoId=$(this).val();
            $.post("${pageContext.request.contextPath}/media/updateVideo",{"id":videoId},function (data) {
                alert(data.msg);
                location.href=location.href;
            })
        })
    })
</script>
<body>
<div>
<h2>视频缩略图</h2>
    <div class="col-md-4">
        <a href="${pageContext.request.contextPath}/excel/doExcelForMembers">
            <button type="button" class="btn btn-success">导出会员信息</button>
        </a>
    </div>
<c:forEach items="${video}" var="video">
    <div class="row">
        <div class="col-sm-4 col-md-12">
            <div class="thumbnail col-md-4 col-md-offset-2">
                <video controls="controls" poster="/fileImages/20180323105534.png"  height="45%" width="70%">
                    <source src="${video.mediaUrl}" type="video/mp4">你的浏览器不支持此播放器.<br>
                </video>
                <div class="caption">
                    <p> <button type="submit" class="btn btn-success" value="${video.id}" name="updateVideo">首页显示</button>
                </div>
            </div>
        </div>
    </div>
</c:forEach>

</div>

</body>
</html>
