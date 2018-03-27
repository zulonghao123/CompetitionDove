<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21
  Time: 16:56
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
        $("button[name=updateStatus]").click(function () {
            var id=$(this).attr("no");
            $.get("${pageContext.request.contextPath}/managers/freezeManager",{id:id},function (data) {

                location.href = location.href;
            })
        })
    })
</script>
<body>
<div class="container">
    <%@include file="managerTop.jsp"%>
    <div class="row">

    <div class="col-lg-8 col-lg-offset-2">
        <table class="table table-striped">
            <tr>
                <td>ID</td>
                <td>姓名</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${managerList}" var="manager">
                <tr>
                    <td>${manager.id}</td>
                    <td>${manager.adminName}</td>
                    <td>
                        <button class="btn btn-info" no="${manager.id}" name="updateStatus">冻结管理员</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<%@include file="page.jsp"%>
</div>
</body>
</html>
