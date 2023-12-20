<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NotifyJoin</title>
</head>
<body>
		<div class="col-sm-12">
           <div class="Notify__join__">
            <p> Crossfit Genio 회원이 되신것을 축하드립니다. 등록하신 정보는 mypage에서 변경하실 수 있습니다.</p>
           <div align="center">
             <button type="submit" class="site-btn"><span class="icon_plus" a href="${contextPath }/main"></span> 메인으로 이동</button>
           </div>
           </div>
</body>
</html>