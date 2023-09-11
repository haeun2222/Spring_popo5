<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="./login.do" method="post">
			아이디 : <input type="text" name="id">
			비밀번호 : <input type="password" name="pw">
			
		<button type="submit">로그인</button>
		<button type="button" onclick="history.back(-1)">취소</button>
		<button type="button" onabort="location.href='./signUpForm.do'">회원가입</button>
		</form>
	</div>

</body>
</html>