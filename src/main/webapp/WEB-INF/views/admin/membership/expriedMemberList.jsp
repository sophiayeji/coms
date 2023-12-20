<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ExpireScheduled</title>
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
        <form action="${contextPath }/admin/membership/expiredMemberList" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>만료회원</h5>
              			 <div class="sidebar__color">
                    <div class="shop__cart__table">                  	
                    	 <div class="row">     
                        <table>
                            <thead>
                                <tr>
                                    <th width="20%">회원이름</th>
                                    <th width="40%">회원번호</th>
                                    <th width="20%">마지막등록일</th>
                                    <th width="15%">전화번호</th>
                                </tr>
                            </thead>                         
                            <tbody>
                            		<c:forEach var="expiredMemberDTO"  items="${expiredMemberList}">
		                            		 <tr>
		                            		 	<td>${expiredMemberDTO.name } </td>                		 
			                                    <td>${expiredMemberDTO.memberId }</td>
			                                    <td><fmt:formatDate value="${expiredMemberDTO.lastExpiredDate }" pattern="yyyy-MM-dd" /></td>
			                                    <td>${expiredMemberDTO.hp } </td>			                                   		                                  				                                  
		                                </tr>
			                        </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>			
        </div>
       </div>
      </form>
     </div>
	</section>
</body>
</html>