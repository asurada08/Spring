<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>#번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>수정일</th>
		</tr>
	</thead>

	<c:forEach items="${list}" var="board">
		<tr>
			<td><c:out value="${board.bno}" /></td>
			<td><c:out value="${board.title}" /></td>
			<td><c:out value="${board.writer}" /></td>
			<td><fmt:formatDate pattern="yyyy-MM-dd"
					value="${board.regdate}" /></td>
			<td><fmt:formatDate pattern="yyyy-MM-dd"
					value="${board.updateDate}" /></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>