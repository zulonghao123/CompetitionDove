<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>媒体上传</title>
</head>
<%@include file="basic.jsp" %>
<body>


<div class="container">
    <div align="center"><h2>媒体资源上传</h2></div>


    <div class="row">
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
            <div><b>上传图片</b></div>
            <form class="form-horizontal" id="imageForm" enctype="multipart/form-data" action="${pageContext.request.contextPath}/media/addMediaImage" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">图片名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="mediaName">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">图片描述</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="messaage">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传图片1</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传图片2</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传图片3</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>


            </form>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button  class="btn btn-default" name="upImage">上传图片</button>
                </div>
            </div>

        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div><b>上传视频</b></div>
            <form class="form-horizontal" id="videoForm" enctype="multipart/form-data" action="${pageContext.request.contextPath}/media/addMediaVideos" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">视频名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="mediaName">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">视频描述</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"   name="messaage">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传视频1</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传视频2</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"   name="myFiles">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上传视频3</label>
                    <div class="col-sm-10">
                        <input type="file" class="form-control"  name="myFiles">
                    </div>
                </div>


            </form>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button  class="btn btn-default" name="upVideo">上传视频</button>
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


        $("button[name='upImage']").click(function () {
            $("#imageForm").submit();
        })
        $("button[name='upVideo']").click(function () {
            $("#videoForm").submit();
        })




    })

</script>
</html>
