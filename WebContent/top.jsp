<%@page import="servlet.Recode"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	private String recodes;
%>
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
		<div class = "recode">

			<h3>
				<%
					for(Recode recode : (List<Recode>)request.getAttribute("recodes")){

					}
				%>

			</h3>

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