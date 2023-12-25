<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-6 col-sm-7">
                <div class="footer__about">
                    <div class="footer__logo">
                        <a style="font-size :30px">Crossfit Genio</a>
                    </div>
                    <p>The greatest battle is not physical, but psychological.
						The demons telling us to give up when we push ourselves to the limit
						can never be silenced for good. </p>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-5">
                <div class="footer__widget">
                    <h6>Quick links</h6>
                    <ul>
                        <li><a href="${contextPath }/expClass/reserveExpClass">체험수업</a></li>
                        <li><a href="${contextPath }/venueRental/reserveVenue">대관신청</a></li>
                        <li><a href="${contextPath }/boardWod/boardList">게시판</a></li>
                        <li><a href="${contextPath}/contact/addContact">Contact</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4">
                <div class="footer__widget">
                    <h6>Account</h6>
                    <ul>
                        <li><a href="/coms/myPage/myInfo?memberId=${sessionScope.memberId}">My Info</a></li>
                        <li><a href="/coms/myPage/myExpClass?memberId=${sessionScope.memberId}">체험수업</a></li>
                        <li><a href="/coms//myPage/myVenueRent?memberId=${sessionScope.memberId}">대관</a></li>
                    </ul>
                </div>
            </div>
              <div class="col-lg-2 col-md-3 col-sm-4">
                <div class="footer__widget">
                    <h6>Privacy Policies</h6>
                 </div>
            <div class="col-lg-4 col-md-8 col-sm-8">
                    <div class="footer__social">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-youtube-play"></i></a>
                        <a href="#"><i class="fa fa-instagram"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                <div class="footer__copyright__text">
                    <p>Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a></p>
                </div>
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            </div>
        </div>
    </div>
</footer>
</body>
</html>