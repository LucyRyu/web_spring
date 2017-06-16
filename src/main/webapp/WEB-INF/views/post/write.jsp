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

    <title>Post</title>

    <!-- Bootstrap core CSS -->
    <link href="/client/css/bootstrap.min.css" rel="stylesheet">


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
                            <li><a href="/member/signUp">회원가입</a></li>
                            <li class="active"><a href="/post/write">글쓰기</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">글 작성</h1>
                <br>

                <form class="form-horizontal" action="/post/write" method="post">


                    <div class="form-group">
                        <label class="col-sm-2 control-label">제목</label>
                        <div class="col-sm-10">
                            <input type="text" id="title" name="title" class="form-control" placeholder="제목을 입력하세요." required>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">내용</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" name="content" rows="3" id="content" placeholder="내용을 입력하세요." equired></textarea>
                        </div>
                    </div>

                    <p class="lead">
                        <button class="btn btn-lg btn-default">Posting</button>
                    </p>

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
