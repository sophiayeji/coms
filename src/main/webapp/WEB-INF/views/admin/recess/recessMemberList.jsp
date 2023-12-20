<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gymMemberSearch</title>
</head>
<body>
<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> AdminMain > 조회</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/recess/recessMemberList" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>휴회자 현황</h5>
                <div class="row">
     			<div class="col-lg-12">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shop__cart__table">                  	
                    	 <div class="row">     
                        <table>
                            <thead>
                                <tr>
                                    <th width="20%">회원이름</th>
                                    <th width="20%">회원번호</th>
                                    <th width="20%">휴회시작일</th>
                                    <th width="20%">휴회마지막일</th>
                                    <th width="20%">회원권 재시작일</th>
                                </tr>
                            </thead>                         
                            <tbody>                          	
                            		<c:forEach var="recessDTO"  items="${recessMemberList }">
		                            		 <tr>
		                            		 	<td>${recessDTO.name } </td>                		 
			                                    <td>${recessDTO.memberId }</td>
			                                    <td>${recessDTO.recessStartDt } </td>		                                  				                                  
			                                    <td>${recessDTO.recessEndDt } </td>		                                  				                                  
			                                    <td>${recessDTO.regRestartDt } </td>		                                  				                                  
			                                </tr>
			                        </c:forEach>                           	
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>			
        </div>
	</section>
</body>
</html>