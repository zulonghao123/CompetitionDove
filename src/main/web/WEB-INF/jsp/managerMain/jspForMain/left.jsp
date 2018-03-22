<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked ">
        <li role="presentation" class="active">
            <a href="#">
                <div class="">主页</div>
            </a>
        </li>

        <%--动态信息管理--%>
        <li role="presentation" class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
               aria-expanded="false">
                动态信息管理 <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li role="presentation"><a
                        href="${pageContext.request.contextPath}/admin/companyDynamic"
                        target="">公司动态管理</a></li>
                <li role="presentation"><a href="http://www.baidu.com" target="_self">赛事动态管理</a></li>
                <li role="presentation"><a href="#">协会组织管理</a></li>
                <li role="presentation"><a href="#">赞助商管理</a></li>
                <li role="presentation"><a href="#">视频管理</a></li>
                <li role="presentation"><a href="${pageContext.request.contextPath}/admin/demo">模版</a></li>
            </ul>
        </li>

        <%--公司信息管理,点开连接到页面--%>
        <li role="presentation" class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
               aria-expanded="false">
                公司信息管理 <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li role="presentation"><a href="#">公司介绍</a></li>
                <li role="presentation"><a href="#">联系我们</a></li>
                <li role="presentation"><a href="#">领导寄语</a></li>
                <li role="presentation"><a href="#">管理阶层</a></li>
            </ul>
        </li>


        <%--数据查询下拉框--%>

        <li role="presentation" class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
               aria-expanded="false">
                数据导出 <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li role="presentation"><a href="#">会员信息</a></li>
                <li role="presentation"><a href="">赛事信息</a></li>
                <li role="presentation"><a href="#">报名信息</a></li>

            </ul>
        </li>


        <%--资料上传下拉框--%>
        <li role="presentation"><a href="#">上传资料</a></li>
        <%--查看留言下拉框--%>
        <li role="presentation"><a href="#">留言管理</a></li>
        <%--栏目管理下拉框--%>
        <li role="presentation"><a href="#">导航栏</a></li>
        <%--跳转至展示网页，查看效果--%>
        <li role="presentation"><a href="http://www.dreamculture.cn" target="_blank">预览</a></li>

    </ul>
</div>