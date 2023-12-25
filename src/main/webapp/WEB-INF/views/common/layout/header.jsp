<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crossfit Genio</title>
</head>
<body>
	 <div class="col-xl-6 col-lg-7">
                    <nav class="header__menu">
                        <ul> 
                           <li><a href="${contextPath }/coms"><span class="icon_house"></span> Home</a></li>
                            <li>&emsp;&emsp;&emsp;</li>
                        	<c:choose> <!--관리자 전용 페이지 -->
                        		<c:when test="${sessionScope.role eq 'admin'}">
		                             <li><a href="#"><span class="icon_menu"></span> 등록</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/gymMember/newRegister">신규회원등록</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/membership/signup">멤버십 등록</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/recess/register">휴회등록</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/locker/register">사물함등록</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/gymmemberpic/picUpdate">회원사진등록</a></li>
		                                </ul>
		                             </li>
		                             <li><a href="#"><span class="icon_menu"></span> 조회</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/gymMember/gymMemberSearch">회원기본정보</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/membership/expireScheduledList">회원권 만료예정</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/locker/lockerSearch">사물함 이용현황</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/membership/paymentHistory">회원권 결제현황</a></li>
	                        			  <li><a href="${contextPath }/coms/admin/recess/recessMemberList">휴회자현황</a></li>
	                        			  <li><a href="${contextPath }/coms/admin/membership/expiredMemberList">만료회원 현황</a></li>
		                                </ul>
		                             </li>
		                             <li><a href="#"><span class="icon_menu"></span> 체험수업</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/expclass/approve">승인</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/expclass/paymentHistory">결제내역</a></li>
		                                </ul>
		                             </li>
		                             <li><a href="#"><span class="icon_menu"></span> 대관신청</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/venueRent/approve">승인</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/venueRent/paymentHistory">결제내역</a></li> 
		                                </ul>
		                             </li>
		                             <li><a href="#"><span class="icon_menu"></span> 매출관리</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/salesData/SalesData_thisMonth">이번달 매출현황</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/salesData/SalesData_thisYear">올해 매출현황</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/salesData/SalesData_yearly">년도별 매출현황</a></li>
	                        			<li><a href="${contextPath }/coms/admin/salesData/MemberAnalysis_thisYear">올해 회원분석</a></li>
	                        			<li><a href="${contextPath }/coms/admin/salesData/MemberAnalysisYearly">년도별 회원분석</a></li>
		                                </ul>
		                             </li>
		                             <li><a href="#"><span class="icon_menu"></span> 기타관리</a>
		                                <ul class="dropdown">
	                        			 <li><a href="${contextPath }/coms/admin/boardWodAdminLogin">공지게시판 관리</a></li>
	                        			 <li><a href="${contextPath }/coms/admin/contact/contactList">고객연락관리</a></li>
		                                </ul>
		                             </li>
                        		</c:when>
                        		<c:otherwise> <!--클라이언트 로그인 전용 페이지 -->
		                             <li><span class="icon_menu"></span> My Pages
		                                <ul class="dropdown">
			                             <li><a href="${contextPath }/coms/myPage/myInfo?memberId=${sessionScope.memberId}"><span class="icon_info"></span> My Info</a></li>
			                             <li><a href="${contextPath }/coms/myPage/myExpClass?memberId=${sessionScope.memberId}"> 체험수업</a></li>
			                             <li><a href="${contextPath }/coms//myPage/myVenueRent?memberId=${sessionScope.memberId}">대관</a></li>
		                             	</ul>
		                             </li>
				                    <li><a href="${contextPath}/coms/contact/addContact">Contact</a></li>
                        		</c:otherwise>
                        	</c:choose>
                        </ul>
                   	  </nav>
                </div>
 	<header class="header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-3 col-lg-2">
                    <div class="header__logo">
                        <a href="./index.html"><<img src="${contextPath }/resources/bootstrap/img/logo.png" alt=""></a>
                    </div>
                </div>  
     			<div class="col-lg-3">
                    <div class="header__right">
                    	<c:choose> <!--클라이언트가 로그인 하기 전 -->
                    		<c:when test="${sessionScope.memberId eq null }">
		                        <div class="header__right__auth">
		                            <a href="${contextPath }/coms/webmember/loginWebMember">Login</a>
		                            <a href="${contextPath }/coms/webmember/register">Register</a>
		                        </div>
                    		</c:when>
                    		<c:otherwise> <!--클라이언트가 로그인 후 -->
		                        <div class="header__right__auth">
		                            <a href="${contextPath }/coms/webmember/logoutWebMember">logout</a>
		                        </div>
                    		</c:otherwise>
                    	</c:choose>	                                                              
                    </div>
                </div>
            </div>
            <div class="canvas__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>   		
</body>
</html>