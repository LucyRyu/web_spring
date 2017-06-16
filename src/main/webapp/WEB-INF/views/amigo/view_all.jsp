<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-15
  Time: 오후 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>전체보기 페이지 입니다.</h1>

<c:forEach var="amigo" items="${list}">
    <ul>
        <li>이름 : ${amigo.amigoName}</li>
        <li>전화번호 : <a href="/amigo/${amigo.amigo_id}">${amigo.hpNum}</a></li>
        <li>이메일 : ${amigo.email}</li>

    </ul>
</c:forEach>

<a href="/amigo/regist">등록</a>
</body>
</html>
