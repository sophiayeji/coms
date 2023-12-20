<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
    function sendSMS(pageName){

    	console.log("문자를 전송합니다.");
    	$("#smsForm").attr("action", pageName + ".do");
    	$("#smsForm").submit();
    }
  </script>
</head>
<body>
<section class="checkout spad">
        <div class="container">
        	<form action="${contextPath }/admin/contact/contactReply" method="post" class="checkout__form" >
             <form class="checkout__form">
                <div class="row">
                    <div class="col-lg-12">
	                	<br><br><br>
                        <h5>컨텍트 답변하기</h5>
				<form:form method="post" id="smsForm">
  				  <ul>
  				  <li>수신번호 : <input type="text" name="to"/></li>
    			  <li>보낼사람 : <input type="text" name="from"/></li>
      			  <li>내용 : <textarea name="text"></textarea></li>
     			  <li><input type="button" onclick="sendSMS('sendSms')" value="전송하기" /></li>
    			 </ul>
  			</form:form>
  			</div>
  		</div>
  	</form>
  	</div>
  </section>
</body>
</html>