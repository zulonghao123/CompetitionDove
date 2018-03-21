<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20 0020
  Time: 下午 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/text/toText" method="post">
    <input type="text" name="phone">
    <input type="submit" value="验证码">
</form>
</body>
</html>
