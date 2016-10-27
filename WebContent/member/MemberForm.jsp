<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 등록</title>
</head>
<body>
	<jsp:include page="/Header.jsp"/>
	<h1>회원 등록</h1>
	<form action='add.do' method='post'>
		이름: <input type='text' name='name' /><br />
		이메일: <input type='text' name='email' /><br />
		암호: <input type='password' name='password' /><br />
		<input type='submit' value='추가' />
		<input type='reset' value='재설정' />
		<input type='button' value='취소' onclick='location.href="list.do"' />
	</form>
	<jsp:include page="/Tail.jsp"/>
</body>
</html>