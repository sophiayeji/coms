<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> AdminMain > 등록</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/gymmemberpic/picUpdate" enctype="multipart/form-data" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>회원사진 업로드</h5>
              			 <div class="sidebar__color">
              			  	<div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>회원아이디 </p>
                                    <input type="text" name="memberId">
                                </div>
                            </div>
                             <div class="col-sm-12">
                                <div class="checkout__form__input">
                                    <p>이미지<span>*</span> <span class="icon_upload"></span> </p>
                                    <input type="file" name="fileName">
                                </div>
                       <div align="right">
                    	<button type="submit" class="site-btn"><span class="icon_plus"></span>등록</button>
                    </div>
</body>
</html>