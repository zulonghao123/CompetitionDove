<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>模板</title>
</head>
<%@include file="basic.jsp" %>
<body>


<div class="container">
    <div align="center"><h2>赛事信息上传</h2></div>


    <div class="row">

        <div class="col-md-1 ">
            <a href="/managers/toManager"><button type="button" class="btn btn-info" id="fanhui">返回主页</button></a>
        </div>
    </div>
    <div class="row">
        <div>
            <h2></h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <form class="form-horizontal" id="addRaceForm" enctype="multipart/form-data" action="${pageContext.request.contextPath}/race/addRace" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">赛事名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="raceName">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">比赛时间</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="times">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">报名费</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="price">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">上传赛事文档</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>


            </form>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button  class="btn btn-default" name="addRace">添加赛事信息</button>
                </div>
            </div>

        </div>
    </div>

</div>





</body>
<script type="text/javascript">
    $(function () {

        var msg = "${message}";
        if(msg.length > 0){
            alert(msg);
        }





        /*返回主页
         *此BUTTON按钮在页面顶端，每个页面都有一个返回主页按钮
         *点击后回到登录成功后进入的页面*/
        $("#BackMainButton").click(function () {
            location.href = "${pageContext.request.contextPath}/admin/login";
        })


        $("button[name='addRace']").click(function () {
            $("#addRaceForm").submit();
        })


    })

</script>
</html>
