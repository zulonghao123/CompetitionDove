<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/23
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <%@include file="basic.jsp" %>
</head>
<script type="text/javascript">
    $(function () {
        var id=$("#lunBoTuId").val();
        $("button[name=updateButton]").click(function () {
            var mediaUrl=$(this).val();
            $.post("${pageContext.request.contextPath}/media/updateLunBoTu",{"id":id,"mediaUrl":mediaUrl},function (data) {
                alert(data.msg);
                location.href=location.href;
            })

        })

    })


</script>
<body>
<a href="/managers/toManager"><button type="button" class="btn btn-info" id="fanhui">返回</button></a>
<c:forEach items="${lunBoTu}" var="video">
    <div class="row">
        <div class="col-sm-4 col-md-12">
            <div class="thumbnail col-md-4 col-md-offset-2">
                <img src="${video.mediaUrl}" alt="">
                <div class="caption">
                    <button type="button" class="btn btn-default" data-dismiss="modal" name="updateButton" value="${video.mediaUrl}">修改</button>
                </div>
            </div>
        </div>
    </div>
</c:forEach>
<input type="hidden" value="${id}" id="lunBoTuId">
</body>
</html>
