<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment History</title>
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
        <form action="${contextPath }/admin/membership/paymentHistory" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>회원 결제 내역</h5>
              			 <div class="sidebar__color">
						<table class="table table-striped table-sm">
						<div class="checkout__form__input">
	                            	<input type="text" name="keyword" value="${keyword }">
	                            	<input type="submit" value="조회" onclick="paymentHistoryList()">
                            	</form>
							</div>
          <thead>
            <tr>             
              <div class="sidebar__color">
              <th scope="col">이름</th>
              <th scope="col">회원번호</th>
              <th scope="col">결제날짜</th>
              <th scope="col">결제금액</th>
              <th scope="col">결제내용</th>
            </tr>
          </thead>
              <c:choose>
                            		<c:when test="${empty paymentHistoryList}">
                            			<tr>
                            				<td colspan="5" align="center"><h6>등록된 정보가 없습니다.</h6></td>
                            			</tr>
                            		</c:when>
                            		<c:otherwise>
                            		<c:forEach var="paymentHistory"  items="${paymentHistoryList }">
		                            		 <tr>
		                            		 	<td>${paymentHistory.name } </td>                		 
			                                    <td>${paymentHistory.memberId }</td>
			                                    <td>${paymentHistory.gymPaymentDt } </td>
			                                    <td>${paymentHistory.gymPaymentAmt } </td>	
			                                    <td>멤버십 </td>	
			                                   	                                  				                                  
			                                </tr>
			                        </c:forEach>
                            		</c:otherwise>
                            	</c:choose>
               <c:choose>
                            		<c:when test="${empty paymentHistoryList}">
                            			<tr>
                            				<td colspan="5" align="center"><h6>등록된 정보가 없습니다.</h6></td>
                            			</tr>
                            		</c:when>
                            		<c:otherwise>
                            		<c:forEach var="paymentHistory"  items="${paymentHistoryList }">
		                            		 <tr>
		                            		 	<td>${paymentHistory.name } </td>                		 
			                                    <td>${paymentHistory.memberId }</td>
			                                    <td>${paymentHistory.lockerPaymentDt } </td>
			                                    <td>${paymentHistory.locekrPaymentAmt } </td>		                                  				                                  
			                                    <td>사물함</td>		                                  				                                  
			                                </tr>
			                        </c:forEach>
                            		</c:otherwise>
                            	</c:choose>
                            </tbody>
                		</tbody>
               
                		
        		</table>
		</body>
	</html>