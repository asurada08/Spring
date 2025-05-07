<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="gameAction" method="post">
	<h1>가위/바위/보 게임</h1>
	YOU : <select name="you">
	<option value="1">가위</option>
	<option value="2">바위</option>
	<option value="3">보</option>
	</select>
	<input type="submit" value="선택">
</form>
</body>
</html>