<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2/002
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/statics/gentelella-master/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/statics/gentelella-master/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="${pageContext.request.contextPath}/statics/gentelella-master/documentation/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/statics/gentelella-master/build/css/custom.min.css" rel="stylesheet">
</head>

<body>

    登录成功
    <a href="${pageContext.request.contextPath}/tmenu/queryFirstTmenu">添加/修改</a>
    <%--<a href="${pageContext.request.contextPath}/tmenu/queryNameByParentId?parentId=0" class="btn btn-primary" role="button">Go！</a>--%>





   

<%@include file="basic.jsp" %>
<script type="text/javascript">
    $(function () {
        var msg="${message}"
        if(msg.length>0) {
            alert(msg);
        }
    })

    history.pushState(null, null, document.URL);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, document.URL);
    });
</script>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="${pageContext.request.contextPath}/managers/login" method="post">
                    <h1>登录</h1>
                    <div>
                        <input type="text" class="form-control" name="adminName" placeholder="Username" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" name="password" placeholder="Password" required="" />
                    </div>
                    <div>
                        <input type="submit" class="btn btn-default submit" value="登录"></input>

                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">


                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                            <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>


    </div>
</div>


</body>

</html>
