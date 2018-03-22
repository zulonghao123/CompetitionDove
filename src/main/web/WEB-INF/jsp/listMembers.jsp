<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21 0021
  Time: 上午 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
      <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
      <script type="text/javascript"
              src="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-5 col-md-offset-4">
                <h1>会员管理页面</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <a href="${pageContext.request.contextPath}/excel/doExcelForMembers">
                    <button type="button" class="btn btn-success">导出会员信息</button>
                </a>
            </div>
            <div class="col-md-4 col-md-offset-4">
                <input type="text" name="string" id="string" value="${shuru}">
                <button type="button" class="btn btn-info" id="sousuo">搜索</button>
                <a href="/managers/toManager"><button type="button" class="btn btn-info" id="fanhui">返回</button></a>
            </div>

        </div>
        <div class="row">
            <div><h2></h2></div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-striped table-bordered table-hover">
                    <tr>
                        <th>会员昵称</th>
                        <th>会员编号</th>
                        <th>运动员名称</th>
                        <th>性别</th>
                        <th>联系电话</th>
                        <th>Email地址</th>
                        <th>操作</th>
                    </tr>
                        <c:forEach items="${pageInfo.list}" var="members">
                            <tr>
                                <td>${members.nickName}</td>
                                <td>${members.memberCode}</td>
                                <td>${members.information.playerName}</td>
                                <td>
                                    <c:if test="${members.information.sex ==0}">男</c:if>
                                    <c:if test="${members.information.sex ==1}">女</c:if>
                                </td>
                                <td>${members.information.phoneNumber}</td>
                                <td>${members.information.email}</td>
                                <td>
                                    <button type="button" name="queryById" membersId="${members.id}" class="btn btn-info">详情</button>
                                </td>
                            </tr>
                        </c:forEach>
                </table>
            </div>
        </div>
    </div>
    <%--使用的分页 引入外部的page页面--%>
    <%@include file="page.jsp"%>

    <!--会员详情模态框-->
    <div class="modal fade" tabindex="-1" role="dialog" id="queryMembersModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">会员信息详情</h4>
                </div>
                <div class="modal-body">
                    <form action="" id="queryGradeForm">
                        <table class="table table-striped table-bordered table-hover">

                            <tr>
                                <th width="40%">会员昵称</th>
                                <td>
                                    <div id="nickNameDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>会员编号:</th>
                                <td>
                                    <div id="memberCodeDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>运动员名称:</th>
                                <td>
                                    <div id="playerNameDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>性别:</th>
                                <td>
                                    <div id="sexDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>联系电话:</th>
                                <td>
                                    <div id="phoneNumberDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>Email地址:</th>
                                <td>
                                    <div id="emailDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>身份证:</th>
                                <td>
                                    <div id="idNumberDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>病史:</th>
                                <td>
                                    <div id="sickDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>紧急联系人名字:</th>
                                <td>
                                    <div id="dangerNameDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>紧急联系人电话:</th>
                                <td>
                                    <div id="dangerPhoneDiv"></div>
                                </td>
                            </tr>
                            <tr>
                                <th>创建时间:</th>
                                <td>
                                    <div id="createDateDiv"></div>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</body>
<script type="text/javascript">
    $(function () {
        /*导出会员信息的按钮的单机事件*/
        $("#daochu").click(function () {
            location.href="${pageContext.request.contextPath}/excel/doExcel";
        })

        /*模糊搜索的方法*/
        $("#sousuo").click(function () {
            var shuru = $("#string").val();
            if(shuru==""){
                location.href="${pageContext.request.contextPath}/members/list?pageNum=1&pageSize=3";
            }else{
                location.href = "${pageContext.request.contextPath}/members/queryFuzzy?shuru="+shuru+"&pageNum=1&pageSize=3";
            }
        })

        /**
         * 详情按钮的点击事件，点击弹出模态框
         */
        $("button[name=queryById]").click(function () {
            var membersId = $(this).attr("membersId");
            $.get("${pageContext.request.contextPath}/members/queryMembersById",{"membersId":membersId},function (data) {
                $("#nickNameDiv").html(data.nickName);
                $("#memberCodeDiv").html(data.memberCode);
                $("#playerNameDiv").html(data.information.playerName);
                var gender = data.information.sex;
                if(gender == 0){
                    gender = "男";
                }else if(gender==1){
                    gender = "女";
                }
                $("#sexDiv").html(gender);
                $("#phoneNumberDiv").html(data.information.phoneNumber);
                $("#emailDiv").html(data.information.email);
                $("#idNumberDiv").html(data.information.idNumber);
                $("#sickDiv").html(data.information.sick);
                $("#dangerNameDiv").html(data.information.dangerName);
                $("#dangerPhoneDiv").html(data.information.dangerPhone);
                var date = new Date(data.information.createDate);
                var y = date.getFullYear();
                var m = date.getMonth();
                var d = date.getDate();
                var h = date.getHours();
                var mm = date.getMinutes();
                var s = date.getSeconds();
                $("#createDateDiv").html(y+"-"+m+"-"+d+" "+h+":"+mm+":"+s);
                $("#queryMembersModal").modal("show");
            })

        })
    })
</script>
</html>
