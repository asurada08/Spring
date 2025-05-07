<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> -->
<!-- <script type="text/javascript" src="js/jquery-2.1.1.js"></script> -->
<script type="text/javascript">
$(function(){
	$('#btnOk').click(function(){
		$('#restform').attr('action',$('#_method').val());
		$('#restform').submit();
	});
});
</script>
</head>
<body>
<h1>${msg}</h1>
<form action="action" id="restform">
	<select id="_method">
		<option value="get">GET</option>
		<option value="post">POST</option>
		<option value="put">PUT</option>
		<option value="delete">DELETE</option>
	</select>
	<input type="button" value="확인" id="btnOk">
</form>
</body>
</html>