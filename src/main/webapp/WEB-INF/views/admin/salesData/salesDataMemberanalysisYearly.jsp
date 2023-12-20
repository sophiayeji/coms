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
                    <a href="${contextPath }/"><i class="fa fa-home"></i> AdminMain > 매출관리</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/salesData/MemberAnalysisYearly" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>년도별 회원분석</h5>
              			 <div class="sidebar__color">
						<table class="table table-striped table-sm">
          <thead>
            <tr>             
              <div class="sidebar__color">
              <th scope="col">발생년도</th>
              <th scope="col">등록건수</th>
              <th scope="col">신규회원 건수</th>             
              <th scope="col">이탈회원 건수</th>                        
              <th scope="col">신규회원 비율</th>                        
              <th scope="col">이탈회원 비율</th>                        
            </tr>
          </thead>
                            		<c:forEach var="SalesData"  items="${MemberAnalysis_Yearly }">
		                            		 <tr>
		                            		 	<td>${SalesData.registerYear } </td>                		 
			                                    <td>${SalesData.registernumber }</td>
			                                    <td>${SalesData.newmember }</td>		                                  
			                                    <td>${SalesData.expiremember } </td>		                                  				                                                                   				                                  
			                                    <td>${SalesData.ratioNewMember } </td>		                                  				                                                                   				                                  
			                                    <td>${SalesData.ratioExpireMember } </td>		                                  				                                                                   				                                  
			                                </tr>
			                        </c:forEach>
                            </tbody>
                		</tbody>
               
                		
        		</table>
		</body>
	</html>