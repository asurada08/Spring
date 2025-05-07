<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="empUpdateAction" method="post">
	<input type="text" name="empno" id="empno" value="${empVO.empno}">
	<table border="1">
		<caption>사원 수정</caption>
		<tr>
			<th>이름</th>
			<td><input type="text" name="ename" value="${empVO.ename}"></td>
		</tr>
		<tr>
			<th>급여</th>
			<td><input type="text" name="sal" value="${empVO.sal}"></td>
		</tr>
		<tr>
			<th>부서</th>
			<td>
				<select name="deptno">
					<c:forEach items="${deptList}" var="dept">
						<option value="${dept.deptno}" <c:if test="${dept.deptno == deptVo.deptno}">selected</c:if> >
						${dept.dname}
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
	<br>
	<input type="submit" value="수정">
</form>
</body>
</html>