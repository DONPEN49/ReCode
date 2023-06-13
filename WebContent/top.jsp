<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="topstyle.css">
<title>ReCode</title>
</head>
<body>
	<header><h1>ヘッダー</h1><hr></header>
	<main>
		<div class = "calender">
			<c:forEach var="week" items="${requestScope.calender }">
				<div class="cell">
					<c:forEach var="day" items="${week }">



					</c:forEach>
					<br>
				</div>
			</c:forEach>
		</div>

		<section>
			<form action="controller" method="post">
				<input type="text" name="recode">
				<input type="submit" value="送信">
			</form>
		</section>
	</main>
</body>
</html>