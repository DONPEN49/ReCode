<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	private String recodes;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>ReCode</title>
</head>
<body>
	<header><h1>みんなの投稿</h1><hr></header>
	<main>
		<div class = "recode">

			<h2>
				<%=request.getAttribute("message") %>
			</h2>

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