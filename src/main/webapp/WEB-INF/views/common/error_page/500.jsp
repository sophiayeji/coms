<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500</title>
</head>
<body>
	<div align="center">
		<h2>Server Problem</h2>
		<img src="${contextPath }/resources/bootstrap/img/500.PNG" alt="500에러 이미지"><br>
		<h4>관리자에게 연락주세요.</h4>
		<h4>관리자 이메일 : sophia.yeji.son@gmail.com</h4>
		<div align="center">
             <button type="submit" class="site-btn"><span class="icon_plus" a href="${contextPath }/main"></span> 메인으로 이동</button>
           </div>	
	</div>
</body>
</html>