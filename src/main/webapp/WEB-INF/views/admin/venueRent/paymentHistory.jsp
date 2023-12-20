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
        <form action="${contextPath }/admin/venueRent/paymentHistory" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>체험수업 결제내역</h5>
              			 <div class="sidebar__color">
						<table class="table table-striped table-sm">
          <thead>
            <tr>             
              <div class="sidebar__color">
              <th scope="col">이름</th>
              <th scope="col">회원번호</th>
              <th scope="col">오더번호</th>              
              <th scope="col">사용인원</th>              
              <th scope="col">결제금액</th>
            </tr>
          </thead>
                            		<c:forEach var="paymentHistory"  items="${paymentHistoryList }">
		                            		 <tr>
		                            		 	<td>${paymentHistory.regNm } </td>                		 
			                                    <td>${paymentHistory.memberId }</td>
			                                    <td>${paymentHistory.uuid }</td>
			                                    <td>${paymentHistory.numUse }</td>		                                  
			                                    <td>${paymentHistory.finalPayment } </td>		                                  				                                  
			                                </tr>
			                        </c:forEach>
                            </tbody>
                		</tbody>
               
                		
        		</table>
		</body>
	</html>