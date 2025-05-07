<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="empInsertAction" method="post">
		<table border="1">
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
				<td><select name="deptVO.deptno">
				    <c:forEach	items="${deptList}" var="dept">
							<option value="${dept.deptno}">${dept.dname}</option>
					</c:forEach></select></td>
			</tr>

		</table>
		<br>
		<input type="submit" value="입력">

	</form>
</body>
</html>