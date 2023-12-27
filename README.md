##### COMS(CROSSFIT GYM MANAGEMENT SYSTEM)
-----------------------------------------------------------------------------------------------------------------
목차	


	1.개요
	2.개발환경 
 		주요 개발자원 H/W
   		주요 개발자원 S/W	
	3.핵심키워드
	4.시스템아키텍쳐
	5.ERD 다이어그램
	6.프로젝트 목적
  프로젝트 관련 추가 포스팅
 
-----------------------------------------------------------------------------------------------------------------

<1>개요
	<li>프로젝트명: Amazon Web Service 기반 크로스핏 체육관 운영 시스템 구축 프로젝트</li>
	<li>수행기간: 2023년 07월 06일 ~ 2023년 08월 02일</li>
 	<li> 사이트주소: www.crossfitgenio.com (클라이언트)
   			www.crossfitgenio.com/admin/adminLogin (어드민)

 
<2>개발환경     
       <li>주요 개발자원(H/W)</li>
       ![image](https://github.com/sophiayeji/coms/assets/125880712/5b1b3dff-3a6e-4906-9e36-e26ede5342f3)
	<li>주요 개발자원(S/W)</li>
       ![image](https://github.com/sophiayeji/coms/assets/125880712/94817871-b755-457f-b2f3-b18be581c0bc)
       
<3> 프로그램 목적
     먼저 프로젝트의 주제와 방향을 정할 떄, 신입개발자로서 첫번쨰 프로젝트는 어떤걸 하면 좋을까라는 세심하게 고민을 했었다.
    고민 끝에 내가 결정내린 주제와 방향은 두 가지로 잡았다. 첫쨰, 학습과정에서 습득한 프로그래밍 언어 및 구현 방법을 적용하는 것이 었고,
    둘쨰, 향후 비즈니스 프로젝트에 기여할 수 있는 개발자로 성장을 하는 것이 었다. 이를 위해, 우선 나에게 익숙한 소규모 비즈니스 관련 플랫폼을 만들어야 겠다고 생각을 했고, 
    5년 동안 크로스핏 체육관을 다닌 경험을 바탕으로 클라이언트와 어드민 버젼의 특화된 플랫폼을 만들기로 결심했다.
    
    어떻게 하면 비즈니스 운영 프로세스를 플랫폼을 통해서 최적화 할 수 있을지, 배운 언어들을 실생활에 이 목적을 구현하기 위해 어떻게 잘 응용할 수 있을지를 생각을 했다. 
   더불어, 전반적인 이번 프로젝트의 목표는 단순한 프로젝트를 넘어 앞으로 나의 개발자 여정에 기여할 수 있는 기반을 마련하는 것이다. 
   이를 달성하기 위해 앞으로 높은 수준의 안정적인 사용자 중심의 플랫폼을 만들어서 비즈니스 성과에 기여할 수 있는 개발자가 되는데 밑거름이 될 수 있는
   프로젝트를 만드는 것이 바로 목표라고 할 수 있다.


<4> 핵심키워드

<4> 시스템 아키텍쳐
![image](https://github.com/sophiayeji/coms/assets/125880712/34423fcf-ab7f-4f30-993c-7e4a42994961)

<5> ERD 다이어그램
![COMS_ERD](https://github.com/sophiayeji/coms/assets/125880712/b6da1d40-0d37-4d39-af99-399129bb0b44)


<7> 핵심기능  
	<li>온라인 예약 및 관리자 페이지에서 예약 승인기능</li>
            승인 기능의 구현은 체험 수업 예약을 효과적으로 처리하고 관리하기 위한 프로세스를 간소화하여 체계적인 방식을 제공하며, 관리자의 고객 서비스 관리 기능을 강화한다.
	    승인 기능은 ExpClassManageController 클래스의 일부로, 특히 /admin/expclass 매핑 내에 위치한다. 이 기능은 /approve 엔드포인트를 통해 액세스되며, 
            여기서 관리자는 대기 중인 수업 요청 목록을 볼 수 있으며, 이를 승인 또는 거부하고 각 주문에 대한 자세한 정보를 검토 할 수 있다.
	    ![my_video](https://github.com/sophiayeji/coms/assets/125880712/c565605b-902f-41c6-85e8-51186e946ef9)
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
	<li>관리자 권한 로그인 로그추적</li>
       스프링 AOP 기술을 사용하여 AdminMemberController를 포인트를 찍고 매서드의 종류, 어드바이즈메서드에 대한 설명, 대상객체를 찍어서 관리자 로그인 활동의 상세한 레코드를 제공함으로써 
       정기적인 모니터링을 할 수 있게 구현했다.
       ![image](https://github.com/sophiayeji/coms/assets/125880712/3bd61046-2edb-49db-b1e5-2f1d18912cc6.gif)
       <li>신규회원 회원고유 번호 자동생성</li>
       고유 회원 ID 생성은 GymMembershipController 클래스 내에서 UUID.randomUUID().toString()를 사용하여 
       UUID(범용고유식별자)를 생성하여, DTO객체의 UUID필드에 저장될 수 있도록 설정하였다.
 	<li>Transaction 기능을 사용하여, 회원 추가 정보 등록 시 정보의 일관성, 무결성 구현</li>
       체욱관의 회원등록 정보, 휴회신청, 사물함, 회원사진 정보추가를 위한 트랜잭션 기능은 고유회원ID를 확인하여 정보를 등록할 수 있게 하여 
       데이터의 무결성과 일관성을 보장할 수 있게 한다.@Transactional 어노테이션과 rollback 속성을 사용하여 트랜잭션을 관리하고, 
       예외발생 시 롤밸을 처리하게 하였다.더불어, 향 후 체육관 회원이 증가함에 따라 트랜잭션 관리가 시스템 성능에 미치는 영향을 평가하여
       개선해봐야 겠다.<br>
       -고유회원번호에 없는 정보를 회원아이디로 입력했을 예외의 경우 아래와 같이 롤백이 처리가 됨-
      ![image](https://github.com/sophiayeji/coms/assets/125880712/16199022-87bc-4fc5-af79-f666099cb333)
      <li>회원관리를 위한 조회기능(관리자페이지)</li>
      ![image](https://github.com/sophiayeji/coms/assets/125880712/cb12d201-7efd-480c-80ef-12b1b3e0a315)
      <li>매출현황 및 회원분석 통계 기능 구현 </li>      
	![image](https://github.com/sophiayeji/coms/assets/125880712/dcadc249-eba2-4ec1-b9f9-c086acecdec7)
	구현된 매출 데이터 분석 기능은 관리자가 다양한 시간 프레임과 범주에 대한 체육관의 매출성과를 파악할 수 있도록 하며,  
	데이터 기반 의사 결정을 지원하며 비즈니스 전략을 최적화하는 데 도움이 되는 역할을 한다. 각 항목별로 해당쿼리는 아래와 같다.
       <li>Session을 이용한 회원/관리자 전용 페이지 구현(역할 기반 액세스 제어 (RBAC) )</li>
        클라이언트와 관리자의 각 역할에 대해 액세스해야 하는 특정 기능과 페이지를 식별하는 것을 구현하였다.<br>
		Admin: 회원 등록, 매출 관리, 시설 예약과 같은 다양한 관리 기능에 액세스<br>
		Client: 개인 정보, 체험, 장소 예약에 대한 액세스<br>
 	우선 WebMemberController에서 로그인 프로세스에서 세션의 사용자의 역할을 설정했으며, JSP에서 <c:choose> 및 <c:when>을 사용하여 
	다양한 역할에 대한 메뉴 항목을 조건부로 표시하여 사용자의 역할에 따라 메뉴를 동적으로 렌더링 하였다. 
 	![Controller 코드](https://github.com/sophiayeji/coms/blob/master/src/main/java/com/application/coms/webmember/controller/WebMemberController.java)
	![jps코드](https://github.com/sophiayeji/coms/blob/master/src/main/webapp/WEB-INF/views/common/layout/header.jsp)     	
       <li>웹회원 비밀번호 Security기능</li>
       WebMemberServiceImpl에서 BcryptPasswordEncoder를 사용하여 비밀번호를 암호화하여 서버에 저장이 되게 하였다.<br>
       -데이터에 암호화되어 저장되어있는 비밀번호-<br>
       ![image](https://github.com/sophiayeji/coms/assets/125880712/51fa5d3d-e8e3-4584-8f53-06ee1e66c16c)

	



	
      
       


					  

 

   
