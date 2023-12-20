<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body> 
	<c:choose>
           <c:when test="${sessionScope.memberId eq null}">
                	<tr>
                      	<td colspan="6"><h3>가입된 회원이 아닙니다.회원가입을 해주세요.</h3></td>
                     </tr>
     		</c:when>
     	
  <c:otherwise>
  
  
  
  
  
   <form action="${contextPath }/myPage/myExpClass" method="post" class="checkout__form">
                        <h5>체험신청내역</h5>
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
                                    <th width="40%">체험날짜</th>
                                    <th width="20%">체험시간</th>
                                    <th width="20%">인원</th>
                                    <th width="15%">승인여부</th>
                                </tr>
                            </thead>                         
                            <tbody>
                            	<c:choose>
                            		<c:when test="${empty expClassDTO}">
                            			<tr>
                            				<td colspan="5" align="center"><h6>신청내역이 없습니다.</h6></td>
                            			</tr>
                            		</c:when>
                            		<c:otherwise>
		                            		 <tr>
		                            		 	<td>${expClassDTO.classDt } </td>                		 
			                                    <td>${expClassDTO.classTime }시</td>
			                                    <td>${expClassDTO.expNum }명 </td>
			                               
			                                  	<c:if test = "${expClassDTO.approvalYn eq null}">
			                                  	<td>확인 중</td></c:if>
			                                 	<c:if test = "${expClassDTO.approvalYn ne null}">
			                                  	<td>${expClassDTO.approvalYn }</td></c:if>
			                                  				                                  
			                                </tr>
                            		</c:otherwise>
                            	</c:choose>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>			
        </div>
	</section>
  		
 	</c:otherwise>
  </c:choose>
        <!-- Checkout Section End -->
   
</body>
</html>