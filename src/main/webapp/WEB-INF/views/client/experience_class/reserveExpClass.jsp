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
	
			var classDt = $("#classY").val() + "-" + $("#classM").val() + "-" + $("#classD").val();
			$("[name='classDt']").val(classDt);

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

<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> 체험수업 신청</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/expClass/reserveExpClass" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>체험 수업신청</h5>
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
                                <input type="text" name="name" placeholder="이름을 입력하세요.">
                            </div>
                        </div>       
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>연락처 <span>*</span></p>
                                <input type="text" name="hp" placeholder="-를 포함해서 입력하세요.">
                          </div>
                        </div>                                
                         <div id="ExpAccompany" class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>총인원 <span>*</span></p>
                                    <select name="expNum">
										<option value="1">1명</option>                                    
										<option value="2">2명</option>                                    
										<option value="3">3명</option>                                    
										<option value="4">4명</option>                                    
										<option value="5">5명</option>                                                              
                                    </select>
                                     <span id="totalPrice"></span>
                                </div>
                            </div>
                             <div id="ExpAccompany" class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>크로스핏 경험자 인원 <span>*</span></p>
                                    <select name="crsftExpNum">
										<option value="1">1명</option>                                    
										<option value="2">2명</option>                                    
										<option value="3">3명</option>                                    
										<option value="4">4명</option>                                    
										<option value="5">5명</option>                                                              
                                    </select>
                                     <span id="totalPrice"></span>
                                </div>
                            </div>                                                    
                               <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>원하는 수업일정 <span>*</span></p>
                                    <select id="classY">
                                    	<c:forEach var="i" begin="2023" end="2025" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="classM">
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
                                    <select id="classD">
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
                                   <input type="hidden" name="classDt"/>	
                                </div>
                            </div>
							<div id="ClassTime" class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>수업시간 <span>*</span></p>
                                    <select name="classTime">
										<option value="1">06:30</option>                                    
										<option value="2">10:00</option>                                    
										<option value="3">12:30</option>                                    
										<option value="4">17:00</option>                                    
										<option value="5">18:00</option>
										<option value="6">19:00</option>
										<option value="7">20:00</option>
										<option value="8">21:00</option>                                                                 
                                    </select>
                                </div>
                            </div>                                                               
                        <div class="col-lg-12">
                            <div class="checkout__form__checkbox">
                            </div>
                        </div>
                    </div>
                     <span>* drop in 비용은 각 인원 당 2만5천원 입니다.<br>
                              			신청인 이름으로 계좌로 입금부탁드립니다.(국민은행 손예지 76070204-209673)<br>
										원활한 수업 진행과 수용 가능한 인원이 정해져 있기때문에<br>
										결제까지 완료가 되어야 수업참여가 가능합니다. <br>
										체험수업 승인 여부는 신청 후 2시간 이내로 MYPAGE에서 확인이 가능합니다.<br></span>               
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