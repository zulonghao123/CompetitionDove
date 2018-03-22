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
            <h1>报名管理页面</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <a href="${pageContext.request.contextPath}/excel/doExcelForApply">
                <button type="button" class="btn btn-success">导出报名信息</button>
            </a>
        </div>
        <div class="col-md-4 col-md-offset-4">
            <select name="id" id="raceId">
                <option value="00">--请选择--</option>
                <c:forEach items="${race}" var="race">
                    <option <c:if test="${raceId eq race.id}">selected="selected"</c:if>  value="${race.id}">${race.raceName}</option>
                </c:forEach>
            </select>
            <button type="button" class="btn btn-info" id="sousuo">搜索</button>
            <a href="/managers/toManager"><button type="button" class="btn btn-info" >返回</button></a>
        </div>
    </div>
    <div class="row">
        <div><h2></h2></div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-bordered table-hover">
                <tr>
                    <th>运动员名称</th>
                    <th>性别</th>
                    <th>联系电话</th>
                    <th>报名编号</th>
                    <th>Email地址</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="apply">
                    <tr>
                        <td>${apply.information.playerName}</td>
                        <td>
                            <c:if test="${apply.information.sex ==0}">男</c:if>
                            <c:if test="${apply.information.sex ==1}">女</c:if>
                        </td>
                        <td>${apply.information.phoneNumber}</td>
                        <td>${apply.applyCode}</td>
                        <td>${apply.information.email}</td>
                        <td>
                            <button type="button" name="queryById" applyId="${apply.id}" class="btn btn-info">详情</button>
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
<div class="modal fade" tabindex="-1" role="dialog" id="queryApplyModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">报名信息详情</h4>
            </div>
            <div class="modal-body">
                <form action="" id="queryGradeForm">
                    <table class="table table-striped table-bordered table-hover">
                        <tr>
                            <th width="40%">赛事名称：</th>
                            <td>
                                <div id="raceNameDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <th width="40%">运动员名称</th>
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
                            <th>电话号码:</th>
                            <td>
                                <div id="phoneNumberDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <th>Email:</th>
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
                        <tr>
                            <th>支付状态:</th>
                            <td>
                                <div id="payStatusDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <th>比赛时间:</th>
                            <td>
                                <div id="timeDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <th>报名价格:</th>
                            <td>
                                <div id="priceDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <th>报名编号:</th>
                            <td>
                                <div id="applyCodeDiv"></div>
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

        /*模糊搜索的方法*/
        $("#sousuo").click(function () {
            var raceId = $("#raceId").val();
            if(raceId==00){
                location.href="${pageContext.request.contextPath}/apply/list?pageNum=1&pageSize=3";
            }else{
                location.href="${pageContext.request.contextPath}/apply/queryApplyByRaceId?raceId="+raceId+"&pageNum=1&pageSize=3";
            }
        })

        /**
         * 详情按钮的点击事件，点击弹出模态框
         */
        $("button[name=queryById]").click(function () {
            var applyId = $(this).attr("applyId");
            $.get("${pageContext.request.contextPath}/apply/queryApplyById",{"applyId":applyId},function (data) {
                $("#raceNameDiv").html(data.race.raceName);
                $("#playerNameDiv").html(data.information.playerName);
                var gender = data.information.sex;
                if(gender == 0){
                    gender = "男";
                }else if(gender==1){
                    gender = "女";
                }
                $("#sexDiv").html(gender);
                $("#phoneNumberDiv").html(data.information.phoneNumber);

                $("#memberCodeDiv").html(data.memberCode);
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
                var payStatus = data.information.payStatus;
                if(payStatus==0){
                    payStatus="以支付";
                }else if(payStatus==1){
                    payStatus = "未支付";
                }
                $("#payStatusDiv").html(payStatus);
                var date = new Date(data.race.time);
                var y = date.getFullYear();
                var m = date.getMonth();
                var d = date.getDate();
                var h = date.getHours();
                var mm = date.getMinutes();
                var s = date.getSeconds();
                $("#timeDiv").html(y+"-"+m+"-"+d+" "+h+":"+mm+":"+s);
                $("#priceDiv").html(data.race.price);
                $("#applyCodeDiv").html(data.applyCode);
                $("#queryApplyModal").modal("show");
            })

        })
    })
</script>
</html>
