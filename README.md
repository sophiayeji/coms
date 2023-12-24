##### COMS(CROSSFIT GYM MANAGEMENT SYSTEM)
-----------------------------------------------------------------------------------------------------------------
목차	


	1.개요
	2.개발환경 
 		주요 개발자원 H/W
   		주요 개발자원 S/W	
	3.핵심키워드
	4.시스템아키텍쳐
	5.E-R 다이어그램
	6.프로젝트 목적
	7.핵심기능
	8.프로젝트를 통해 느낀점
	9.프로젝트 관련 추가 포스팅
 
-----------------------------------------------------------------------------------------------------------------

<1>개요
	<li>프로젝트명: Amazon Web Service 기반 크로스핏 체육관 운영 시스템 구축 프로젝트</li>
	<li>수행기간: 2023년 07월 06일 ~ 2023년 08월 02일</li>
 	<li> 사이트주소: www.crossfitgenio.com (클라이언트)
   			www.crossfitgenio.com/admin/adminLogin (어드민)

 
<2>개발환경     
       <li>주요 개발자원(H/W)</li>
       ![image](https://github.com/sophiayeji/coms/assets/125880712/09e869a6-0257-431b-92d1-27145a2c2f96)
	<li>주요 개발자원(S/W)</li>
      ![image](https://github.com/sophiayeji/coms/assets/125880712/bfb756d7-e17c-4441-b97a-11121e743253)

<3> 핵심 키워드 

<7> 핵심기능  
	<li>온라인 예약 및 관리자 페이지에서 예약 승인기능</li>
            승인 기능의 구현은 체험 수업 예약을 효과적으로 처리하고 관리하기 위한 프로세스를 간소화하여 체계적인 방식을 제공하며, 관리자의 고객 서비스 관리 기능을 강화한다.
	    승인 기능은 ExpClassManageController 클래스의 일부로, 특히 /admin/expclass 매핑 내에 위치한다. 이 기능은 /approve 엔드포인트를 통해 액세스되며, 
            여기서 관리자는 대기 중인 수업 요청 목록을 볼 수 있으며, 이를 승인 또는 거부하고 각 주문에 대한 자세한 정보를 검토 할 수 있다. 
	    ![image](https://github.com/sophiayeji/coms/assets/125880712/bf4d5bcc-8f69-4a25-b577-0d5037b64922)
            ![image](https://github.com/sophiayeji/coms/assets/125880712/238aed18-faa1-4fd2-bf22-21069d854d9b)
            ExpClasService 클래스의 addApprovalYn 메서드: 데이터베이스에서 승인 상태를 업데이트하는 역할을 한다.
	    ExpClassDAO 클래스의 insertApprovalYn 메서드: EXPERIENCE_CLASS 테이블의 APPROVAL_YN 필드를 수정하기 위한 SQL 업데이트 문을 실행함으로, 승인여부를 업데이트 할 수 있다.<br><br>         
      <li>공지사항 게시판 기능 구현(게시판 작성 관리자 제한)</li>
        클라이언트와 관리자 간의 알림판 사용에 대한 제한된 기능을 구현하여, 관리자는 게시글을 작성, 편집, 삭제할 수 있으며, 클라이언트는 게시글을 읽을 수만 있다.<br>
         **관리자 권한 확인**: WebMemberService를 이용하여 로그인한 사용자의 권한을 확인하며, AdminMemberController에서 로그인한 사용자의 세션에 관리자 권한이 있는 경우에만 
	                      접근이 허용이 된다.<br>
         **게시글 수정 및 삭제 권한 제한** : BoardWodController에서 게시글 수정 및 삭제 시 관리자 여부를 확인하여 해당 권한이 없는 경우 접근이 차단된다.
                                          더불어, 게시판 목록 및 상세내역 JSP를 클라이언트와 관리자용으로 따로 만들어 관리자용 JSP에만 게시판 작성,수정,삭제 기능을
                                          넣어 외부에서 게시판 권한을 보호할 수 있도록 하였다.
       
       ![image](https://github.com/sophiayeji/coms/assets/125880712/3bd61046-2edb-49db-b1e5-2f1d18912cc6)

					  
					  

 

   
