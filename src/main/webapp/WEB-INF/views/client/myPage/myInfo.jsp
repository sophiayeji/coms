<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function removeWebMember(){
		if (confirm("정말로 탈퇴하시겠습니까?")) {
			location.href = "${contextPath}/myPage/removeWebMember?memberId=" + $("#memberId").val();
	}
}
		
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
      <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="col-lg-12 col-md-12 col-sm-12">
                <div class="cart__btn update__btn" align="right">
                    <a href="javascript:removeWebMember();"><span class="icon_trash_alt"></span>탈퇴</a>
                </div>
            </div>
            <form action="${contextPath }/myPage/modifyInfo" method="post" class="checkout__form">
             <div class="col-lg-12">
                        <h5>내 가입 정보</h5>
                        <div class="row">
     			<div class="col-lg-12">
                    <div class="my__info__table">		      					  
     					  <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__form__input">
                                    <p>아이디 <span>*</span></p>
                                    <input type="text" id="memberId" name="memberId" value="${webMemberDTO.memberId }" readonly>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__form__input">
                                    <p>비밀번호 <span>*</span></p>
                                    <input type="password" name="passwd" value="${webMemberDTO.passwd }">
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__form__input">
                                    <p>이름 <span>*</span></p>
                                    <input type="text" name="memberNm" value="${webMemberDTO.memberNm }">
                                </div>
                            </div>                     
                             <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="checkout__form__input">
                                    <p>연락처 <span>*</span></p>
                                    <input type="text" name="hp" value="${webMemberDTO.hp }">
                               </div>
                          </div>
                      <div class="col-lg-12">
                                <div class="checkout__form__checkbox" align="right">
                               	 	<button type="submit" class="site-btn" ><span class="icon_pencil-edit"></span> 수정</button>                               	 	
                      	       </div>
                            </div>
                            </div>
                            </div>
                            </div>
                            </div>
                            </div>
                            </form>
                            </div>
                            </section>    
         	</c:otherwise>
  </c:choose>                     
</body>
</html>