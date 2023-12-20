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
	
			var recessStartDt = $("#recessStartY").val() + "-" + $("#recessStartM").val() + "-" + $("#recessStartD").val();
			$("[name='recessStartDt']").val(recessStartDt);

	});
		$("form").submit(function(){
			
			var recessEndDt = $("#recessEndY").val() + "-" + $("#recessEndM").val() + "-" + $("#recessEndD").val();
			$("[name='recessEndDt']").val(recessEndDt);

	});
		
		$("form").submit(function(){
			
			var regRestartDt = $("#regRestartY").val() + "-" + $("#regRestartM").val() + "-" + $("#regRestartD").val();
			$("[name='regRestartDt']").val(regRestartDt);

	});
		
		
		
		$("form").submit(function(){
			
			var regRestartEndDt = $("#regRestartEndY").val() + "-" + $("#regRestartEndM").val() + "-" + $("#regRestartEndD").val();
			$("[name='regRestartEndDt']").val(regRestartEndDt);

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
                    <a href="${contextPath }/"><i class="fa fa-home"></i> 휴회 신청</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/recess/register" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>재등록 신청</h5>
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
                               <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>휴회시작일 <span>*</span></p>
                                    <select id="recessStartY">
                                    	<c:forEach var="i" begin="2023" end="2028" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="recessStartM">
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
                                    <select id="recessStartD">
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
                                   <input type="hidden" name="recessStartDt"/>	
                                </div>
                            </div>
                             <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>휴회종료일 <span>*</span></p>
                                    <select id="recessEndY">
                                    	<c:forEach var="i" begin="2023" end="2028" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="recessEndM">
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
                                    <select id="recessEndD">
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
                                   <input type="hidden" name="recessEndDt"/>	
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>회원권 재시작일 <span>*</span></p>
                                    <select id="regRestartY">
                                    	<c:forEach var="i" begin="2023" end="2028" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="regRestartM">
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
                                    <select id="regRestartD">
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
                                   <input type="hidden" name="regRestartDt"/>	
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__order__widget">
                                    <p>회원권 종료일 <span>*</span></p>
                                    <select id="regRestartEndY">
                                    	<c:forEach var="i" begin="2023" end="2028" >
                                    		<option>${i}</option>
                                    	</c:forEach>
                                    </select>년 
                           			  <select id="regRestartEndM">
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
                                    <select id="regRestartEndD">
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
                                   <input type="hidden" name="regRestartEndDt"/>	
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
                  			       
                           
                  			       
                           