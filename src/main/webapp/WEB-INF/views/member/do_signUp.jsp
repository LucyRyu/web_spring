<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>DoSingUp</title>

    <!-- Bootstrap core CSS -->
    <link href="/client/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/client/css/signin.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/client/css/cover.css" rel="stylesheet">

</head>
<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Lucy</h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="/member/signUp">회원가입</a></li>
                            <li><a href="/post/write">글쓰기</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">

                <h2 class="form-signin-heading">회원가입이 완료 되었습니다.</h2>
                <br>

                <form class="form-horizontal">

                    <div class="form-group">
                        <label class="col-sm-4 control-label">ID</label>
                        <div class="col-sm-8">
                            <p class="form-control-static">${member.userId}</p>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">EMAIL</label>
                        <div class="col-sm-8">
                            <p class="form-control-static">${member.email}</p>
                        </div>
                    </div>



                </form>

                <p class="lead">
                    <a href="/post/write" class="btn btn-lg btn-default">글쓰기화면으로</a>
                </p>


            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>@ <a href="https://github.com/LucyRyu/web_spring">GitHub/Lucy</a>, by <a href="#">@Lucy</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/client/js/bootstrap.min.js"></script>

</body>
</html>
