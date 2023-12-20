<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
             <form class="checkout__form">
                <div class="row">
                    <div class="col-lg-12">
	                	<br><br><br>
                        <h5>컨텍트 상세</h5>
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="checkout__form__input">
                                    <p>이름 </p>
                                    <input type="text" value="${contactDTO.name }" disabled>
                                </div>
                            </div>
                           <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="checkout__form__input">
                                    <p>연락처 </p>
                                    <input type="text"value="${contactDTO.hp }" disabled>
                                </div>
                            </div>
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="checkout__form__input">
                                    <p>제목 </p>
                                    <input type="text" value="${contactDTO.subject }" disabled>
                                </div>
                            </div>
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="checkout__form__input">
                                    <p>내용 </p>
                                    <textarea cols="130" rows="10" disabled>${contactDTO.content }</textarea>
                                </div>
                            </div>
                        </div>
                        </div>
                    </div>
                    <div align="right">
                    	<button type="submit" class="site-btn"><span class="icon_plus"></span>답변하기</button>
                    </div>
                </form>
            </div>
        </section>
</body>
</html>