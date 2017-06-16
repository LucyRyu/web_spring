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

    <title>SingUp</title>

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

                <form class="form-signin" action="/member/signUp" method="post">
                    <h2 class="form-signin-heading">멤버 등록 화면입니다</h2>

                    <label for="userId" class="sr-only">ID를 입력하세요</label>
                    <input type="text" name="userId" id="userId" class="form-control" placeholder="UserId" required autofocus>
                    <br>

                    <label for="password" class="sr-only">Password를 입력하세요</label>
                    <input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
                    <br>

                    <label for="email" class="sr-only">Email을 입력하세요</label>
                    <input type="text" name="email" id="email" class="form-control" placeholder="Email" required>
                    <br>


                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
                </form>

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
