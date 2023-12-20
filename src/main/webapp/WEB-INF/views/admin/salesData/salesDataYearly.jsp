<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<a href="${contextPath }/"><i class="fa fa-home"></i>
							AdminMain > 매출관리</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Checkout Section Begin -->
	<section class="checkout spad">
		<div class="container">
			<form action="${contextPath }/admin/salesData/SalesData_thisYear"
				method="post" class="checkout__form">
				<div class="row">
					<div class="col-lg-8">
						<h5>년도별 매출현황</h5>
						<div class="sidebar__color">
							<table class="table table-striped table-sm">
								<thead>
									<tr>
										<div class="sidebar__color">
											<th scope="col">발생년</th>
											<th scope="col">항목</th>
											<th scope="col">매출금액</th>
											<th scope="col">년도별 총 매출금액</th>
									</tr>
								</thead>
								<c:forEach var="SalesData" items="${SalesDataYearly }">
									<tr>
										<td>${SalesData.sales_year }</td>
										<td>${SalesData.category }</td>
										<td>${SalesData.amount }</td>
										<td>${SalesData.Grand_total }</td>
									</tr>
								</c:forEach>
								</tbody>
								</tbody>
							</table>
</body>
</html>