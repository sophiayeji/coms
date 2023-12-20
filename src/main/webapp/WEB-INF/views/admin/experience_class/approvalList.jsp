<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__links">
                    <a href="${contextPath }/"><i class="fa fa-home"></i> AdminMain > 조회</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Checkout Section Begin -->
<section class="checkout spad">
    <div class="container">
        <form action="${contextPath }/admin/expclass/approve" method="post" class="checkout__form" >
            <div class="row">
                <div class="col-lg-8">
                    <h5>체험수업 승인</h5>
              			 <div class="sidebar__color">
                    <div class="shop__cart__table">                  	
                    	 <div class="row">     

							<div class="card-body p-0">
                                        <div class="table-responsive">
                                            <table class="table table-hover mb-0">
                                                <tbody class="align-middle"></tbody>
                                                <thead class="text-xs font-monospace">
                                                    <tr>
                                                        <td class="px-4 py-2 border-bottom-0 text-muted">번호</td>
                                                        <td class="px-4 py-2 border-bottom-0 text-muted">주문번호</td>
                                                        <td class="px-4 py-2 border-bottom-0 text-muted">총인원</td>
                                                        <td class="px-4 py-2 border-bottom-0 text-muted">날짜</td>
                                                        <td class="px-4 py-2 border-bottom-0 text-muted">시간</td>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                	<c:forEach var="expClassDTO" items="${expClassList }">
                                                    <tr>
                                                        <td class="px-4 border-top">
                                                             <c:set var="startBoardIdx" value="${startBoardIdx = startBoardIdx + 1}"/>
                                                                ${startBoardIdx}</td>                                                       
                                                        <td class="px-4 border-top"><a href="${contextPath }/admin/expclass/detail?uuid=${expClassDTO.uuid }">${expClassDTO.uuid}</a></td>
                                                        <td class="px-4 border-top">${expClassDTO.expNum}</td>
                                                        <td class="px-4 border-top">${expClassDTO.classDt}</td>
                                                        <td class="px-4 border-top">${expClassDTO.classTime}시</td>
                                                        
                                                    </tr>
                                                 </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
              
                                   <ul class="pagination"><li class="paginate_button page-item previous disabled" id="dataTable_previous">
                                   	<c:if test="${startPage > 10}">
                                   <a href="${contextPath }/admin/expclass/approve?currentPageNumber=${startPage - 10}&onePageViewCnt=${onePageViewCnt  }" aria-controls="dataTable" data-dt-idx="0" tabindex="0" class="page-link">Previous</a></li>
                                   </c:if>
                                   <c:forEach var="i" begin="${startPage }" end="${endPage }">
                                   <li class="paginate_button page-item active">
										<a href="${contextPath }/admin/expclass/approve?currentPageNumber=${startPage + 10}&onePageViewCnt=${onePageViewCnt  }" aria-controls="dataTable" data-dt-idx="i" tabindex="0" class="page-link">${i }</a></li>
									</c:forEach>
									<c:if test="${endPage != allPageCnt && endPage >= 10}">
										<li class="paginate_button page-item next" id="dataTable_next">
										<a href="${contextPath }/admin/expclass/approve?currentPageNumber=${startPage + 10}&onePageViewCnt=${onePageViewCnt  }" aria-controls="dataTable" data-dt-idx="7" tabindex="0" class="page-link">Next</a></li></ul>                      	
									</c:if>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</section>
</body>
</html>