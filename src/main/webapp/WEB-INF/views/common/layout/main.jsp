<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
	<style>
		img { display : block;
			  margin : auto;}
	</style>
</head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- Categories Section Begin -->
    <section class="categories">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6 p-0">
                    <div class="categories__item categories__large__item set-bg"
                    data-setbg="${contextPath }/resources/img/main1.png">
                    <div class="categories__text">
                        <a href="${contextPath }/expClass/reserveExpClass" style="font-size: 40px; color: black;">체험수업 신청</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 ">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6 p-0">
                        <div class="categories__item set-bg" data-setbg="${contextPath }/resources/img/main2.png">
                            <div class="categories__text">
                                 <a href="${contextPath }/venueRental/reserveVenue" style="font-size: 40px; color: white;" >대관 신청</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 p-0">
                        <div class="categories__item set-bg" data-setbg="${contextPath }/resources/img/main6.png">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 p-0">
                        <div class="categories__item set-bg" data-setbg="${contextPath }/resources/img/main4.png">
                            <div class="categories__text">
                                <a href="${contextPath }/boardWod/boardList" style="font-size: 40px; color: red;">게시판</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 p-0">
                        <div class="categories__item set-bg" data-setbg="${contextPath }/resources/img/main5.png">
                            <div class="categories__text">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
	<!-- Categories Section End -->

	<!-- TimeTable Section Begin -->
	<section class="timetable">
   		<img width="1200" height="849" src="https://crossfitltd.com.au/wp-content/uploads/2022/05/Timetable-2021-1.jpg"
 		class="attachment-full size-full" alt="" decoding="async" srcset="https://crossfitltd.com.au/wp-content/uploads/2022/05/Timetable-2021-1.jpg 1200w, 
		https://crossfitltd.com.au/wp-content/uploads/2022/05/Timetable-2021-1-300x212.jpg 300w, https://crossfitltd.com.au/wp-content/uploads/2022/05/Timetable-2021-1-1024x724.jpg 
		1024w" sizes="(max-width: 1200px) 100vw, 1200px, style= align:middle;">
	</div>
	</section>
	<!-- TimeTable Section End -->
	
	<!--Location Section Start! -->
		<section class="location" style="text-align:center;">
			<h5>Location info</h5>
							<ul>
								<li>
									<h6>
										<i class="fa fa-map-marker", ></i> Address
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
					<div id="daumRoughmapContainer1691161041372"
						class="mymap root_daum_roughmap root_daum_roughmap_landing os_mac"
						style="z-index: 2; width: 450px; margin:auto;">

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
		</section>		
	<!--Location Section End! -->		
		
</body>
</html>