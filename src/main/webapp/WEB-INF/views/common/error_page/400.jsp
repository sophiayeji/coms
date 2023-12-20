<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404</title>
</head>
<body>
	<div align="center">
		<h2>Bad Request</h2>
		<img src="${contextPath }/resources/img/400.PNG" alt="400에러 이미지">
		<h4>4O0 ERROR <br>
		페이지를 찾을 수 없습니다.<br>
		페이지가 존재하지 않거나, 사용할 수 없는 페이지입니다.<br>
		입력하신 내용이나 주소가 정확한지 다시 한번 확인해주세요. </h4>
	<div align="center">
             <button type="submit" class="site-btn"><span class="icon_plus" a href="${contextPath }/main"></span> 메인으로 이동</button>
           </div>	
	</div>	
</body>
</html>