<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add board</title>
<script src="${contextPath }/resources/ckeditor/ckeditor.js"></script>  
</head>
<body>
	<div align="center" style="padding-top: 100px">
		<form action="${contextPath }/boardWod/addBoard" method="post">
			<h2>WOD 게시글 작성</h2>
			<br>
			<table style="width: 80%;" border="1">
				<colgroup>
					<col width="20%">
					<col width="80%">
				</colgroup>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="writer" size="100" required/></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="subject" size="100" required/></td>
				</tr>
				<tr>
					<td>글내용</td>
					<td>
						<textarea rows="10" cols="50" name="content" required></textarea>
						<script>CKEDITOR.replace("content");</script>
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="글쓰기""/>
						<input type="button" value="목록보기"  onclick="location.href='${contextPath }/boardWod/boardListAdmin'">
						
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>