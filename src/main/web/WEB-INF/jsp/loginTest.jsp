<%--
  Created by IntelliJ IDEA.
  User: 祖龙浩
  Date: 2018/3/21
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="basic.jsp"%>
</head>
<body>
    <button id="membersLogin">会员报名</button>
    <button id="noMembersLogin">非会员报名</button>





    <div class="modal fade" tabindex="-1" role="dialog" id="membersLoginModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">会员登录</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="loginForm">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">用户名:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="userName" placeholder="用户名"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">密码:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="password" placeholder="密码"/>
                            </div>
                        </div>


                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" name="loginButton">登录</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->




    <div class="modal fade" tabindex="-1" role="dialog" id="addApply">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">报名确认</h4>
                </div>
                    确定报名比赛吗?
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" name="addApplyButton">报名</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->



    <div class="modal fade" tabindex="-1" role="dialog" id="noMembersAddApply">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">填写报名信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="informationForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">姓名</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="playerName" placeholder="姓名"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">性别</label>
                            <div class="col-sm-9">
                                <select name="sex" class="form-control">
                                    <option value="0">男</option>
                                    <option value="1">女</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">电话号码</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="phoneNumber" placeholder="电话号码"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">邮箱</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="Email" placeholder="邮箱"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">身份证</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="idNumber" placeholder="身份证"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">病史</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="sick" placeholder="病史"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">紧急联系人</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="dangerName" placeholder="紧急联系人"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">紧急联系电话</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="dangerPhone" placeholder="紧急联系电话"/>

                            </div>
                        </div>

                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" name="addInformationButton">报名</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->












</body>
<script type="text/javascript">
    $(function () {
        $("#membersLogin").click(function () {
            $("#membersLoginModal").modal("show");
        })


        $("button[name='loginButton']").click(function () {
           var members = $("#loginForm").serialize();
           $.post("${pageContext.request.contextPath}/members/login",members,function (data) {
               var msgCode = data.code;
               if(msgCode=="0000"){
                   alert("登录成功")
                   $("#membersLoginModal").modal("hide");
                   $("#addApply").modal("show");
               }else{
                   alert("登录失败");
                   $("#membersLoginModal").modal("hide");
                   location.href = location.href;
               }

           });

        })
        $("button[name='addApplyButton']").click(function () {
            var raceId = "";
            $.post("${pageContext.request.contextPath}/apply/addApplyByMember",{"raceId":4},function (data) {
                alert(data);

                $("#addApply").modal("hide");
                location.href = location.href;

            });
        })

        $("#noMembersLogin").click(function () {
            $("#noMembersAddApply").modal("show");
        })
        $("button[name='addInformationButton']").click(function () {
            var playerName = $("input[name='playerName']").val();
            var sex = $("select[name='sex']").val();
            var phoneNumber = $("input[name='phoneNumber']").val();
            var Email = $("input[name='Email']").val();
            var sick = $("input[name='sick']").val();
            var dangerName = $("input[name='dangerName']").val();
            var idNumber = $("input[name='idNumber']").val();
            var dangerPhone = $("input[name='dangerPhone']").val();
            var raceId = "";


            $.post("${pageContext.request.contextPath}/apply/addApplyByNoMember",
                {"playerName":playerName,"sex":sex,"phoneNumber":phoneNumber,"Email":Email,"sick":sick,"dangerName":dangerName,"idNumber":idNumber,"dangerPhone":dangerPhone,"raceId":4},
                function (data) {
                    alert(data);
                    $("#noMembersAddApply").modal("hide");
                    location.href = location.href;
            })
        })






    })
</script>
</html>
