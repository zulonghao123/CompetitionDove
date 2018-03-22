<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="row">
    <div class="col-md-6 col-md-offset-4">
        <h1>网页管理系统</h1>
    </div>
</div>
<div class="row">
    <div class="col-md-4 col-md-offset-8">
<c:if test="${login.power==0}">
            <a href="${pageContext.request.contextPath}/managers/toFreeze" class="btn btn-primary btn-lg active" role="button">
             冻结管理员
            </a>
</c:if>
        <h5>欢迎：${login.adminName}</h5>
        <h5><a href="${pageContext.request.contextPath}/managers/logout">退出</a></h5>
    </div>
</div>
