<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<script>

</script>

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
	<form action="${contextPath }/admin/expclass/detail" method="post" class="checkout__form">
		<section class="checkout spad">
			<div class="container">
				<div class="row">
					<div class="small mb-1">order#${expClassDTO.uuid }</div>
					<br>
					<div class="fs-5 mb-5">
						<br>

						<div class="middle mb-1">
							<p>전화번호: ${expClassDTO.hp }</p>
							<p>이름: ${expClassDTO.name }</p>
							<p>일정: ${expClassDTO.classDt }</p>
							<p>수업시간: ${expClassDTO.classTime }</p>
							<p>인원: ${expClassDTO.expNum }</p>
							<p>경험자 인원: ${expClassDTO.crsftExpNum }</p>
							<p>승인여부: ${expClassDTO.approvalYn }</p>
							<p>
								등록날짜:
								<fmt:formatDate value="${expClassDTO.regDt}"
									pattern="yyyy-MM-dd" />
							</p>
							<br>
						</div>
						<div id="approveY" class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__order__widget">
								<p>
									승인여부 <span>*</span>
								</p>
								<select name="approvalYn">
									<option value="Y">YES</option>
									<option value="N">NO</option>
								</select>
							</div>
							<input type="hidden" name="uuid" value="${expClassDTO.uuid }">
							<input class="btn btn-primary" type="submit" value="submit">
						</div>
					</div>
				</div>
			</div>
		</section>
	</form>

</body>
</html>