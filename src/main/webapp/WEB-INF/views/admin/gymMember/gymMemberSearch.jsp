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
        <form action="${contextPath }/admin/gymMember/gymMemberSearch" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>회원기본정보</h5>
              			 <div class="sidebar__color">
                            <div class="section-title">
                                <h4>Member Search</h4>
                            </div>
                            <div class="checkout__form__input">
	                            	<input type="text" name="keyword" value="${keyword }">
	                            	<input type="submit" value="조회" onclick="gymMemberSearch()">
                            	</form>
							</div>
                        </div>
                    </div>
                </div>
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
                                    <th width="40%">회원번호</th>
                                    <th width="20%">전화번호</th>
                                    <th width="15%">최초등록일</th>
                                </tr>
                            </thead>                         
                            <tbody>
                            	<c:choose>
                            		<c:when test="${empty gymMemberList}">
                            			<tr>
                            				<td colspan="5" align="center"><h6>등록된 정보가 없습니다.</h6></td>
                            			</tr>
                            		</c:when>
                            		<c:otherwise>
                            		<c:forEach var="gymMemberDTO"  items="${gymMemberList }">
		                            		 <tr>
		                            		 	<td>${gymMemberDTO.name } </td>                		 
			                                    <td>${gymMemberDTO.memberId }</td>
			                                    <td>${gymMemberDTO.hp } </td>
			                                    <td>${gymMemberDTO.firstRegDt } </td>		                                  				                                  
			                                </tr>
			                        </c:forEach>
                            		</c:otherwise>
                            	</c:choose>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>			
        </div>
	</section>
</body>
</html>