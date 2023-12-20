<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Breadcrumb Begin -->
	<div class="breadcrumb-option">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb__links">
						<a href="${contextPath }/"><i class="fa fa-home"></i> Home</a> <span>Contact</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb End -->

	<!-- Contact Section Begin -->
	<section class="contact spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6">
					<div class="contact__content">
						<div class="contact__address">
							<h5>Contact info</h5>
							<ul>
								<li>
									<h6>
										<i class="fa fa-map-marker"></i> Address
									</h6>
									<p>서울특별시 강남구 언주로168길 15 지하1층</p>
								</li>
								<li>
									<h6>
										<i class="fa fa-phone"></i> Phone
									</h6>
									<p>
										<span>02-586-0840</span>
									</p>
								</li>
								<li>
									<h6>
										<i class="fa fa-headphones"></i> Support
									</h6>
									<p>sophia.yeji.son@gmail.com</p>
								</li>
							</ul>
						</div>
						<div class="contact__form">
							<h5>SEND MESSAGE</h5>
							<form action="${contextPath }/contact/addContact" method="post">
								<input type="text" name="name" 	  placeholder="이름을 입력하세요."> 
								<input type="text" name="hp"   placeholder="전화번호를 입력하세요."> 
								<input type="text" name="subject" placeholder="제목을 입력하세요.">
								<textarea name="content"  placeholder="메세지를 입력하세요." ></textarea>
								<button type="submit" class="site-btn">Send Message</button>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">

					<!-- 지도 -->
					<div id="daumRoughmapContainer1691161041372"
						class="mymap root_daum_roughmap root_daum_roughmap_landing os_mac"
						style="z-index: 2; width: 450px;">

					<script charset="UTF-8" class="daum_roughmap_loader_script"
						src="https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js"></script>
					<script charset="UTF-8"
						src="http://t1.daumcdn.net/kakaomapweb/place/jscss/roughmap/b88f2e2f/roughmapLander.js"></script>
					<script charset="UTF-8"
						src="http://t1.daumcdn.net/kakaomapweb/place/jscss/roughmap/b88f2e2f/roughmapLander.js"></script>
					<!-- 3. 실행 스크립트 -->
					<script charset="UTF-8">
						new daum.roughmap.Lander({
							"timestamp" : "1691161041372",
							"key" : "2fr5x",
							"mapWidth" : "640",
							"mapHeight" : "360"
						}).render();
					</script>

				</div>
			</div>
	</section>
	<!-- Contact Section End -->
</body>
</html>