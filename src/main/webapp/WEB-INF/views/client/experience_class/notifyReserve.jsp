<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NotifyReserve</title>
</head>
<body>
		<div class="col-sm-12">
           <div class="Notify__join__">
            <p> 체험수업 신청해주셔서 감사합니다. 승인여부는 2시간이내에 MY PAGE에서 확인이 가능합니다.</p>
           <div align="center">
             <button type="submit" class="site-btn"><span class="icon_plus" a href="${contextPath }/main"></span> 메인으로 이동</button>
           </div>
           </div>
</body>
</html>