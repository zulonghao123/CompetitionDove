<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20 0020
  Time: 上午 10:55
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
        <form id="addForm" method="post">
            会员的用户名:<input type="text"  name="userName" >
            信息的运动员名：<input type="text" name="information.playerName">
        </form>
        <button type="submit">增加</button>

</body>
    <script type="text/javascript" >
        $(function () {
           $("button[type=submit]").click(function () {
               var members = $("#addForm").serialize();
               alert(members);
               $.post("${pageContext.request.contextPath}/members/addMembers",members,function (data) {
                   alert("成功");
               })
           })
        })
    </script>
</html>
