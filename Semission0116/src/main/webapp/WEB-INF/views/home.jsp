<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="user" method="post">
		<label for="id">아이디</label><input type="text" name="id" id="id" /><br />
		<label for="pwd">비밀번호</label><input type="password" name="pwd"	id="pwd" /><br />
		<input type="submit" value="로그인" /> <input	type="reset" value="취소" />
	</form>
</body>
</html>