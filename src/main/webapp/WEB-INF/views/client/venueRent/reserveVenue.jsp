<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venue Reserve</title>
<script>
	
	$().ready(function() {

		$("form").submit(function(){

			var rentDt = $("#rentY").val() + "-" + $("#rentM").val() + "-" + $("#rentD").val()
			$("[name='rentDt']").val(rentDt);

		});
});

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
<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> 체육관 대관 신청</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/venueRental/reserveVenue" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>대관신청</h5>
                    <div class="row">
                    	 <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>아이디 </p>
                                    <input type="text" name="memberId" value="${memberInfo.memberId }" readonly>
                                </div>
                            </div>                          
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>이름 <span>*</span></p>
                                <input type="text" name="regNm" placeholder="이름을 입력하세요.">
                            </div>
                        </div>       
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>연락처 <span>*</span></p>
                                <input type="text" name="hp" placeholder="-를 포함해서 입력하세요.">
                            </div>
                        </div> 
                         <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                <p>원하는 대관일정<span>*</span></p>
                                 	<select id="rentY">
										<c:forEach var="i" begin="2023" end="2025">
											<option value=${i }>${i}</option>
										</c:forEach>
									</select>년 
									<select id="rentM">
										<c:forEach var="i" begin="1" end="12">
											<option value=${i }>${i}</option>
										</c:forEach>
									</select>월 
									<select id="rentD">
										<c:forEach var="i" begin="1" end="31">
										<option value=${i }>${i}</option>
										</c:forEach>
									</select>일
								 <input type="hidden" name="rentDt"/>		     
                             </div>
                      	  </div>
                      	  <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>시간 <span>*</span></p>
                                    <select id="rentT" name ="rentT">
                                    	<c:forEach var="i" begin="8" end="22" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>시 
                       	 	</div>                                                                         
                         </div>
                      	  <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>사용시간 <span>*</span></p>
                                    <select id="rentHour" name ="rentTime">
                                    	<c:forEach var="i" begin="1" end="5" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>시간 
                       	 	</div>                                                                         
                         </div>
                      	   <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>사용인원 <span>*</span></p>
                                    <select id="numUse" select name ="numUse">
                                    	<c:forEach var="i" begin="1" end="30" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>명 
                        	</div>                                                                         
                         </div>
                           <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>사용목적 <span>*</span></p>
                                <input type="text" name="purposeUse" placeholder="사용목적을 입력하세요.">
                            </div>
                        </div>       
                              <span '>* 신청인 이름으로 계좌로 입금부탁드립니다.(국민은행 손예지 76070204-209673)<br>
										결제까지 완료가 되어야 사용이 가능합니다. <br>
							                        
                    <div align="right">
                    	<button type="submit" class="site-btn"><span class="icon_plus"></span>신청</button>
                    </div>
                </div>
            </form>
        </div>
    </section>
    <!-- Checkout Section End -->
    </c:otherwise>
  </c:choose>
</body>
</script>