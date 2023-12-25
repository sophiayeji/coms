<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board detail</title>
</head>
</head>
<body>

	<div align="center" style="padding-top: 100px">
		<h2>WOD게시글 상세</h2>
		<table style="width: 700px; text-align: center" border="1">
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tr>
				<td>제목</td>
				<td>${BoardWodDTO.subject }</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${BoardWodDTO.readCnt }</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${BoardWodDTO.writer }</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><fmt:formatDate value="${BoardWodDTO.enrollDt}" pattern="yyyy-MM-dd"/> </td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>${BoardWodDTO.content }</td>
			</tr>
			<tr align="right">
				<td colspan="2">
					<input type="button" value="수정"  onclick="location.href='${contextPath }/boardWod/modifyBoard?uuid=${BoardWodDTO.uuid }'">
					<input type="button" value="삭제"  onclick="location.href='${contextPath }/boardWod/removeBoard?uuid=${BoardWodDTO.uuid }'">
					<input type="button" value="목록보기"  onclick="location.href='${contextPath }/boardWod/boardListAdmin'">
				</td>
			</tr>
		</table>		
	</div>
</body>
</html>