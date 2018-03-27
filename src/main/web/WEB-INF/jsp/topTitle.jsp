<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导航 -->
<div class="nav">
    <div class="wp">
        <ul>
            <li>
                <a href="${pageContext.request.contextPath}/main/queryAllMain" class="on">
                    首页</a>
            </li>
            <li>
                <a href="" class="">赛鸽简介</a>
                <div class="sub" style="display: none;">
                    <c:forEach items="${dovelist}" var="dove">
                        <a href="${pageContext.request.contextPath}/main/toSecondPage?Url=${dove.menuUrl}">${dove.menuName}</a>
                    </c:forEach>
                </div>
            </li>
            <li>
                <a href="#projectId" class="">项目专区</a>
                <div class="sub" style="display: none;">
                    <c:forEach items="${projectlist}" var="project">

                        <a
                                href="${pageContext.request.contextPath}/project/doProjectDetail?projectId=${project.id}">

                                ${project.menuName}
                        </a>
                    </c:forEach>
                </div>
            </li>
            <li>
                <a href="" class="">赛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;事</a>
                <div class="sub" style="display: none;">
                    <c:forEach items="${racelist}" var="race">

                        <a
                                href="${pageContext.request.contextPath}/race/doRaceDetail?raceId=${race.id}">
                                ${race.menuName}
                        </a>
                    </c:forEach>
                </div>
            </li>
            <li>
                <a href="#partnergroup" >合作伙伴</a>

            </li>
            <li>
                <a href="#contactUs" >联系我们</a>

            </li>
        </ul>
        <div class="m-so">
            <input class="int" type="text"><input class="btn" value="" type="submit">
        </div>
        <div class="c"></div>
    </div>
</div>
<!-- 导航 end -->