<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

게시글상세보기

		<div>
			<div>아이디 : ${dto.id}</div>
			<div>제목 : ${dto.title}</div>
			<div>내용 : ${dto.content}</div>
			<div>작성일 : ${dto.regdate}</div>
		</div>
		<div>
			<button type="button" onclick="location.href='./updateForm.do'">수정</button>
			<button>삭제</button>
		</div>

</body>
</html>