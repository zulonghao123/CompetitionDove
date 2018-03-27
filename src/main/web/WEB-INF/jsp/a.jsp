<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>付款</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
      <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
      <script type="text/javascript"
              src="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

    <%--点击支付按钮的时候要给controller 传入一个information信息表的主键,之后用来修改状态使用的--%>
    <button id="alipay" onclick="window.open('./wappay/pay.jsp')">点击支付</button>

</body>
    <script type="text/javascript">
        $(function () {
            var informationId=$();
            $.post("${pageContext.request.contextPath}/alipay/toPay",{"informationId":informationId})
        })
    </script>
</html>