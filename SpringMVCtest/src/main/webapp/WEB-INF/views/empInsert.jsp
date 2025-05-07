<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="empInsertAction" method="post">
		<table>
			<caption>사원입력</caption>
			<tr>
				<td>이름</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>급여</td>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<td>부서</td>
				<td><select><c:forEach items="${deptList}" var="dept">
					<option value="${dept.deptno}">${dept.dname}</option>
				</c:forEach></select></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="입력">
	</form>
</body>
</html>