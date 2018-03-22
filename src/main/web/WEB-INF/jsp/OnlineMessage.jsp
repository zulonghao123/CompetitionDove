<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>在线留言</title>
</head>
<%@include file="basic.jsp" %>
<body>
<div class="container">
    <div align="center"><h2>留言管理</h2></div>


    <div class="row">
        <div class="col-md-1 col-md-offset-8">
        </div>
        <div class="col-md-1 ">
            <a href="/managers/toManager"><button type="button" class="btn btn-info" id="fanhui">返回</button></a>
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
                    <%--<td></td>--%>
                    <td>ID</td>
                    <td>内容</td>
                    <td>状态</td>

                    <td>操作</td>

                </tr>
                <c:forEach items="${pageInfo.list}" var="list">
                    <tr>
                            <%-- <td>
                                 <input type="checkbox" value="&lt;%&ndash;${.id}&ndash;%&gt;">
                             </td>--%>
                        <td>${list.id}</td>
                        <td>${list.messageForm}</td>
                        <td>

                            <c:if test="${list.status==0}">未读</c:if>
                            <c:if test="${list.status==1}">已读</c:if>

                        </td>
                        <td>
                            <button class="btn btn-info" name="detailButton" no="${list.id}">查询</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <%@include file="page.jsp" %>
</div>


<%--详情的模态框--%>
<div class="modal fade" tabindex="-1" role="dialog" id="detailWindow">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">详情</h4>
            </div>
            <div class="modal-body">
                <table>
                    <tr>
                        <td>ID</td>
                        <td>
                            <div id="IDDiv"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>内容：</td>
                        <td>
                            <div id="messageFormDiv"></div>
                        </td>
                    </tr>
                    <%--<tr>
                        <td>状态：</td>
                        <td>
                            <div id="statusDiv"></div>
                        </td>
                    </tr>--%>
                </table>

            </div>
            <div class="modal-footer">
                <button type="button" name="detailWindowCloseButton" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
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


        /*新增
         *此BUTTON按钮在页面顶端，
         *点击后 跳转到html页面编辑*/
        $("#addMainButton").click(function () {
            alert("跳转到html页面编辑");
        })


        /*查询一条
         * 此BUTTON按钮在list每行后面，
         * 点击后弹出模态框
         * 显示一条*/
        $("button[name=detailButton]").click(function () {
            var id = $(this).attr("no");
            var url = "${pageContext.request.contextPath}/OnlineMessage/detailOnlineMessage";
            $.get(url, {"id": id}, function (detailData) {
                /!*查询到detail后，为每个空赋值*!/
                $("#IDDiv").html(detailData.id);
                $("#messageFormDiv").html(detailData.messageForm);
            })
            $("#detailWindow").modal("show");

        })
        $("button[name=detailWindowCloseButton]").click(function () {
            location.href = location.href;
        })

        /*删除
         *此BUTTON按钮在list每行后面，
         * 点击后执行删除，刷新页面*/
        $("button[name=deleteButton]").click(function () {
            var id = $("button[name=deleteMainButton]").attr("no");

            /* var url = ";
             $.post(url,{"id":id},function (deleteBackData) {
             alert("deleteBackData.msg");
             location.href = location.href;
             })*/

            /*这个alert测试使用，用完删除*/
            alert("删除功能测试完毕");

        })

        /*修改
         *此BUTTON按钮在list每行后面，
         * 点击后进入html编辑页面 */
        $("button[name=updateButton]").click(function () {
            /*var id = $(this).attr("na");
             var url =
             location.href = url;*/
            alert("点击后进入html编辑页面");
        })


    })

</script>
</html>
