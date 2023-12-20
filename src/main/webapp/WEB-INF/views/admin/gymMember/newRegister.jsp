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
	
			var firstRegDt = $("#firstRegY").val() + "-" + $("#firstRegM").val() + "-" + $("#firstRegD").val();
			$("[name='firstRegDt']").val(firstRegDt);

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
                    <a href="${contextPath }/"><i class="fa fa-home"></i> 신규회원 등록</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/gymMember/newRegister" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>신규회원 등록</h5>
                    <div class="row">
                    	 <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>이름 </p>
                                    <input type="text" name="name">
                                </div>
                            </div>                                                                        
                               <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>최초등록일 <span>*</span></p>
                                    <select id="firstRegY">
                                    	<c:forEach var="i" begin="2023" end="2025" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="firstRegM">
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
                                    <select id="firstRegD">
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
                                   <input type="hidden" name="firstRegDt"/>	
                                </div>
                            </div>
                             <div class="col-lg-12">
                                <div class="checkout__form__input">
                                    <p>주소</p>
                                    <input type="text" id="address" name="address">
                                </div>
                        </div> 
                        	<div class="col-lg-12">
                                <div class="checkout__form__input">
                                    <p>연락처</p>
                                    <input type="text" id="hp" name="hp">
                                </div>
                        </div>
                        <div class="col-lg-12">
                                <div class="checkout__form__input">
                                    <p>나이</p>
                                    <input type="text" id="age" name="age">
                                </div>
                        </div>
                        <div class="col-lg-12">
                                <div class="checkout__form__input">
                                    <p>메모</p>
                                     <textarea rows="5" cols="100" name="memo" placeholder="특이사항을 메모하세요."></textarea> 
                                	<script>CKEDITOR.replace("memo");</script>
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
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
