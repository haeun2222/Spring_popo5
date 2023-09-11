<%@page import="com.min.edu.dto.BoardDto"%>
<%@page import="java.util.List"%>
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


	<div>
		<table>
			<thead>
			<tr>
				<th>연번</th>
				<th>아이디</th>
				<th>제목</th>
				<th>작성일</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="dto" items="${lists}">
			<tr>
				<td>${dto.seq}</td>
				<td>${dto.id}</td>
				<td><a href="./detail.do?seq=${dto.seq}">${dto.title}</a></td>
				<td>${dto.regdate}</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<button onclick="location.href='./writeForm.do'">새글쓰기</button>
	</div>

</body>
</html>