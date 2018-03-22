<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>公司动态管理页</title>
</head>
<%@include file="../basic.jsp" %>
<body>
<div>
    《---<br>
    公司动态管理页.jsp<br>
    需要的数据和方法<br>
    1、查询公司动态的list<br>
    2、创建一篇文章同时将文章相关字段添加到数据库（news）<br>
    3、修改字段信息<br>
    4、删除一篇文章内容，同时删除news表中字段<br>
    news_companyDynamic
    ---》<br>

</div>


<div class="container">
    <div align="center"><h2>公司动态管理页</h2></div>


    <div class="row">
        <div class="col-md-1 col-md-offset-8">
            <button class="btn btn-info" id="addMainButton">添加main</button>
        </div>
        <div class="col-md-1 ">
            <button class="btn btn-info" id="BackMainButton">返回主页</button>
        </div>
    </div>
    <div class="row">
        <div>
            <h2></h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <table class="table table-striped">
                <tr>
                    <td></td>
                    <td>ID</td>
                    <td>mainname</td>
                    <td>maintime</td>
                    <td>mainother</td>
                    <td>操作</td>

                </tr>
                <%-- <c:forEach items="${pageInfo.list}" var="" >--%>
                <tr>
                    <td>
                        <input type="checkbox" value="<%--${.id}--%>">
                    </td>
                    <td>id</td>
                    <td>name</td>
                    <td>
                        time<%--<fmt:formatDate value="${time}" pattern="yyyy-MM-dd"></fmt:formatDate>--%>
                    </td>
                    <td>other</td>
                    <td>
                        <button class="btn btn-info" name="updateMainButton" no="${main.id}">修改</button>
                        <button class="btn btn-danger" name="deleteMainButton" no=${main.id}>删除</button>
                    </td>
                </tr>
                <%--</c:forEach>--%>
            </table>
        </div>
    </div>
    <%@include file="../page.jsp" %>
</div>


</body>
<script type="text/javascript">
    $(function () {
        /*返回主页
         *此BUTTON按钮在页面顶端，每个页面都有一个返回主页按钮
         *点击后回到登录成功后进入的页面*/
        $("#BackMainButton").click(function () {
            location.href = "${pageContext.request.contextPath}/admin/login";
        })


        /*新增一篇文章
         *此BUTTON按钮在页面顶端，
         *点击后 跳转到html页面编辑*/
        $("#addMainButton").click(function () {
            alert("跳转到html页面编辑");
        })

        /*删除一条
         *此BUTTON按钮在list每行后面，
         * 点击后执行删除，刷新页面*/
        $("button[name=deleteMainButton]").click(function () {
            var id = $("button[name=deleteMainButton]").attr("no");

            /* var url = "
            ${pageContext.request.contextPath}//";
             $.post(url,{"id":id},function (deleteBackData) {
             alert("deleteBackData.msg");
             location.href = location.href;
             })*/

            alert("删除功能测试完毕");

        })
        /*修改文章
         *此BUTTON按钮在list每行后面，
         * 点击后进入html编辑页面 */
        $("button[name=updateMainButton]").click(function () {
            alert("点击后进入html编辑页面");
        })


    })

</script>
</html>
