<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: msi
  Date: 2018/3/20
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <%@ include file="basic.jsp"%>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>

    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/statics/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/statics/ueditor/ueditor.all.js"></script>

    <script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath}/statics/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript">
        var ue=UE.getEditor('editor');
    </script>

    <script type="text/javascript">
        function fun(){
            var ue = UE.getEditor('editor').getPlainTxt();
            alert(ue);
        }
    </script>

    <script type="text/javascript">
        $(function () {
            //加载页面 置灰按钮
            $("#addButton").attr("disabled",true);
            $("#updateButton").attr("disabled",true);

            $("#firstSelect").click(function () {
                $("#secondSelect").empty();
                $("#secondSelect").append("<option value='0'>—请选择二级菜单—</option>");
            })
            $("#firstSelect").blur(function () {
                var firstId = $("#firstSelect").val();
                if(firstId==0) {
                    return;
                }
                $.get("${pageContext.request.contextPath}/tmenu/querySecondTmenu",{"parentId":firstId},function (secondList) {
                    console.log(secondList);
                    $.each(secondList,function (index,content) {
                        var str = " <option value='"+content.id+"'>"+ content.menuName +"</option>";
                        $("#secondSelect").append(str);
                    })
                })
            })

            //查询
            $("#queryButton").click(function () {
                clear();
                $("#addButton").attr("disabled",true);
                $("#updateButton").attr("disabled",true);
                if($("#firstSelect").val()==0||$("#secondSelect").val()==0) {
                    alert('请选择一级菜单或二级菜单');
                    return;
                }
                var tmenuId = $("#secondSelect").val();
                $("#tmenuId").val(tmenuId);
                $.get("${pageContext.request.contextPath}/news/queryNewsByTmenuId",{"tmenuId":tmenuId},function (data) {
                    if(data!=null) {
                        alert("此菜单只可以修改");
                        $("#addButton").attr("disabled",true);
                        $("#updateButton").attr("disabled",false);
                    }else{
                        alert("此菜单为空，请增加信息");
                        $("#addButton").attr("disabled",false);
                        $("#updateButton").attr("disabled",true);
                    }
                    $("#title").val(data.title);
                    $("#introduce").val(data.introduce);
                    $("#newsContent").val(data.newsContent);
                    $(document).ready(function(){
                        var ue = UE.getEditor('editor');
                        var proinfo=data.newsContent;
                        ue.ready(function() {//编辑器初始化完成再赋值
                            ue.setContent(proinfo);  //赋值给UEditor
                        });
                    });

                })
            })

            //添加
            $("#addButton").click(function () {
                var forms = $("#form").serialize();
                alert(forms);
                $.post("${pageContext.request.contextPath}/news/addNews",forms,function (data) {
                    alert(data.msg);
                    location.href = "${pageContext.request.contextPath}/tmenu/queryFirstTmenu";
                })
            })
            
            //修改
            $("#updateButton").click(function () {
                var forms = $("#form").serialize();
                $.post("${pageContext.request.contextPath}/news/updateNews",forms,function (data) {
                    alert(data.msg);
                    location.href = "${pageContext.request.contextPath}/tmenu/queryFirstTmenu";
                })
            })
        })

        function clear() {
            $("#title").val("");
            $("#tmenuId").val("");
            $("#introduce").val("");
            $(document).ready(function(){
                var ue = UE.getEditor('editor');
                    ue.ready(function() {//编辑器初始化完成再赋值
                    ue.setContent("");  //赋值给UEditor
                });
            });
        }
    </script>


    <%--添加菜单--%>
    <script type="text/javascript">
        $(function () {
            var msg= "${msg}";
            if(msg.length>0){
                alert(msg);
                location.href = "${pageContext.request.contextPath}/tmenu/queryFirstTmenu";
            }
        })
    </script>
</head>
<body>
    <div class="row" align="center">
        <form action="${pageContext.request.contextPath}/tmenu/addTmenu" method="post">
            <div>
                <h2>增加标题</h2>
                <%--<select name="parentId" id="tiaojian" class="form-control">
                    <option value="00">--请选择--</option>
                    <c:forEach items="${list}" var="list">
                        <option value="${list.id}">${list.menuName}</option>
                    </c:forEach>
                </select>--%>
                <select id="tianjian" name="parentId">
                    <option value="0" selected="selected">—请选择一级菜单—</option>
                    <c:forEach items="${firstList}" var="firstList">
                        <option value="${firstList.id}">${firstList.menuName}</option>
                    </c:forEach>
                </select>
                    <input type="text" name="menuName" id="name">
                    <button type="submit" class="btn btn-info" id="sousuo">增加</button>
            </div>


        </form>
    </div>
    <div>
        <div align="center">
            <h2>增加新闻</h2>
            <select id="firstSelect" >
                <option value="0" selected="selected">—请选择一级菜单—</option>
                <c:forEach items="${firstList}" var="firstList">
                    <option value="${firstList.id}">${firstList.menuName}</option>
                </c:forEach>
            </select>

            <select id="secondSelect">
                <option value="0" selected="selected">—请选择二级菜单—</option>
            </select>
            <button  id="queryButton" class="btn btn-info">查询</button>
        </div>
            <form class="form-horizontal" id="form">
                <input type="hidden" id="tmenuId" name="tmenu.id" class="form-control">
                <div align="center" class="form-group">
                    <label class="col-sm-1 control-label col-sm-offset-2">标题</label>
                    <div class="col-sm-7">
                        <input type="text" id="title" name="title" class="form-control">
                    </div>
                </div>
                <div align="center" class="form-group">
                    <label class="col-sm-1 control-label col-sm-offset-2">简述</label>
                    <div class="col-sm-7">
                        <input type="text" id="introduce" name="introduce" class="form-control">
                    </div>
                </div>
                <%--html编辑器--%>
                <textarea id="editor" style="height:360px" name="newsContent"></textarea>
            </form>

        <%--<input type="button" value="预览" onclick="fun()" class="btn btn-info">--%>
        <div align="center">
            <input type="button" value="添加" id="addButton" class="btn btn-info">
            <input type="button" value="修改" id="updateButton" class="btn btn-warning">
        </div>
    </div>
</body>

</html>
