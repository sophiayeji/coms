<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<script>

	$().ready(function() {

		$("form").submit(function(){
	
			var lockerStartDt = $("#lockerStartY").val() + "-" + $("#lockerStartM").val() + "-" + $("#lockerStartD").val();
			$("[name='lockerStartDt']").val(lockerStartDt);

	});
		$("form").submit(function(){
			
			var paymentDt = $("#payY").val() + "-" + $("#payM").val() + "-" + $("#payD").val();
			$("[name='paymentDt']").val(paymentDt);

	});
		$("form").submit(function(){
			
			var lockerEndDt = $("#lockerEndY").val() + "-" + $("#lockerEndM").val() + "-" + $("#lockerEndD").val();
			$("[name='lockerEndDt']").val(lockerEndDt);

	});
		
				
});

</script>
</head>
<body>
<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> 사물함 등록</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/locker/register" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>사물함 등록</h5>
                    <div class="row">
                    	 <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>이름 </p>
                                    <input type="text" name="name">
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>회원아이디 </p>
                                    <input type="text" name="memberId">
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>사물함번호 </p>
                                    <input type="text" name="lockerNum">
                                </div>
                            </div>                                              
                         <div id="firstRegMon" class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>등록개월수 <span>*</span></p>
                                    <select name="lockerMon">
										<option value="1">1개월</option>                                    
										<option value="2">2개월</option>                                    
										<option value="3">3개월</option>                                    
										<option value="6">6개월</option>                                                                      
                                    </select>
                                </div>
                            </div>                                          
                               <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>사용시작일 <span>*</span></p>
                                    <select id="lockerStartY">
                                    	<c:forEach var="i" begin="2023" end="2025" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="lockerStartM">
                                    	<c:forEach var="i" begin="1" end="12" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>월
                                    <select id="lockerStartD">
                                    	<c:forEach var="i" begin="1" end="31" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>일
                                   <input type="hidden" name="lockerStartDt"/>	
                                </div>
                            </div>
                             <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>결제일 <span>*</span></p>
                                    <select id="payY">
                                    	<c:forEach var="i" begin="2023" end="2025" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="payM">
                                    	<c:forEach var="i" begin="1" end="12" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>월
                                    <select id="payD">
                                    	<c:forEach var="i" begin="1" end="31" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>일
                                   <input type="hidden" name="paymentDt"/>	
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>사용종료일 <span>*</span></p>
                                    <select id="lockerEndY">
                                    	<c:forEach var="i" begin="2023" end="2025" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="lockerEndM">
                                    	<c:forEach var="i" begin="1" end="12" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>월
                                    <select id="lockerEndD">
                                    	<c:forEach var="i" begin="1" end="31" >
                                    		<c:choose>
	                                    		<c:when test="${i < 10 }">
		                                    		<option>0${i}</option>
	                                    		</c:when>
	                                    		<c:otherwise>
		                                    		<option>${i}</option>
	                                    		</c:otherwise>
                                    		</c:choose>
                                    	</c:forEach>
                                    </select>일
                                   <input type="hidden" name="lockerEndDt"/>	
                                </div>
                            </div>
                             <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>결제금액 </p>
                                    <input type="text" name="PaymentAmt">
                                </div>
                            </div>
                             <div id="paymentMethod" class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>결제수단 <span>*</span></p>
                                    <select name="paymentMethod">
										<option value="credit card">신용카드</option>                                    
										<option value="cash">현금</option>                                                                                             
                                    </select>
                                </div>
                            </div>
                        </div>             
                    <div align="right">
                    	<button type="submit" class="site-btn"><span class="icon_plus"></span>등록</button>
                    </div>
                </div>
            </form>
        </div>
    </section>
    <!-- Checkout Section End -->	
</body>
</script>         
                  			       
                           