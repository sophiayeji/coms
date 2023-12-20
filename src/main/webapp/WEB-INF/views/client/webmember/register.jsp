<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<script>



var validateMemberId = false;
var validateMatchPw = false;
var validateRegPw = false; 

$().ready(function() {

	$("#duplicatedIdCheck").click(function(){
				   
	    $.ajax({
	       type : "post",
	       url  : "${contextPath}/webmember/overlappedId",
	       data : {"memberId" : $("#memberId").val()},	   
	       success : function (isOverLapped){
	          if (isOverLapped == "N"){
				  $("#result").html("<span style='color:blue;'>사용할 수 있는 ID</span>");
				  validateMemberId = true;
	          }
	          else {
	          	$("#result").html("<span style='color:red;'>사용할 수 없는 ID</span>");
	          	validateMemberId = false; 
	          }
	       }
	  });	    

	});
	
	
	$("#confirmPasswd").blur(function(){
		
		if ($("#passwd").val() != $("#confirmPasswd").val()) {
			$(".successPwChk").text("비밀번호가 일치하지 않습니다.");
			$(".successPwChk").css("color", "red");
			validateMatchPw = false;
			
		}else{
			$(".successPwChk").text("비밀번호가 일치합니다.");
			$(".successPwChk").css("color", "green");
			$("#pwMatchChk").val("true");
			validateMatchPw = true;
		}
				
	});
	
	$("#passwd").blur(function(){
		

		 var pw = $("#passwd").val();
		 var num = pw.search(/[0-9]/g);
		 var eng = pw.search(/[a-z]/ig);
		 var reg = pw.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi);

		 if($("#passwd").val().length < 8 || $("#passwd").val().length > 20){
			 	$(".successPwChk").text("8자리 ~ 20자리 이내로 입력해주세요.");
				$(".successPwChk").css("color", "red");
				validateRegPw = false;	
		 }else if($("#passwd").val().search(/\s/) != -1){
			 	$(".successPwChk").text("비밀번호는 공백 없이 입력해주세요.");
				$(".successPwChk").css("color", "red");
				validateRegPw = false;	
		 }else if(num < 0 || eng < 0 || spe < 0 ){
				$(".successPwChk").text("영문,숫자,특수문자를 혼합하여 입력해주세요.");
				$(".successPwChk").css("color", "red");
				validateRegPw = false;
		 }else {
			console.log("통과"); 
			validateRegPw = true;
		 }		
	});	

});
</script>
</head>
<body>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> Client</a>
                    <span>Register</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/webmember/register" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>회원가입</h5>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>아이디 <span>*</span></p>
                                <input type="text" id="memberId" name="memberId" style="width: 60%;" placeholder="아이디를 입력하세요.">
                                <input type="button" id="duplicatedIdCheck" value="중복확인"  style="width: 20%; padding-left: 0">
                                <span id="result" style="font-size: 15px;"></span><br>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>비밀번호 <span>*</span></p><span style='color:red; font-size: 15px;'></span>
                                <input type="password" id="passwd" name="passwd"  placeholder="비밀번호를 입력하세요.">
                                <span class="point successPwChk" style="font-size:15px;"></span><br>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>비밀번호 확인 <span>*</span></p>
                                <input type="password" id="confirmPasswd" name="confirmPasswd" placeholder="비밀번호를 확인하세요.">
                                 <span class="point successPwChk" style="font-size:15px;"></span><br>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>이름 <span>*</span></p>
                                <input type="text" name="memberNm" placeholder="이름을 입력하세요.">
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                           <div class="checkout__order__widget">
                                <p>성별 <span style="color:red;">*</span></p>
                                남 &nbsp;<input type="radio" name="sex" value="m"> &emsp;
                                여 &nbsp;<input type="radio" name="sex" value="f">
                            </div>
                        </div>
          
                        <div class="col-sm-12">
                            <div class="checkout__form__input">
                                <p>연락처 <span>*</span></p>
                                <input type="text" name="hp" placeholder="-를 포함해서 입력하세요.">
                                <div class="checkout__order__widget">
                                    <label for="PrivacyYn">
                                        본인은 개인정보 수집 및 이용에 대하여 동의합니다. <br>
                                        1.수집목적: 이벤트 안내문자 <br>
                                        2.수집항목: 이름, 휴대폰 번호<br>
                                        3.보유 및 이용기간: 입력일로부터 1년까지<br>  
                                        <input type="checkbox" id="PrivacyYn" name="PrivacyYn" value="Y">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                            </div>
                        </div>                     
                        <div class="col-lg-12">
                            <div class="checkout__form__checkbox">
                            </div>
                        </div>
                    </div>
                    <div align="right">
                    	<button type="submit" class="site-btn" id= "submitForm"><span class="icon_plus"></span> 가입</button>
                    </div>
                </div>
            </form>
        </div>
    </section>
    <!-- Checkout Section End -->
</body>



</script>