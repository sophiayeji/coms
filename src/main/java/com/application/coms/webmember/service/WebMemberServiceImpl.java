package com.application.coms.webmember.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//import com.application.coms.admin.Logger.controller.UnauthorizedAccessException;
import com.application.coms.webmember.dao.WebMemberDAO;
import com.application.coms.webmember.dto.WebMemberDTO;



@Service
public class WebMemberServiceImpl implements WebMemberService {
	
	@Autowired
	private WebMemberDAO webMemberDAO;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void addWebMember(WebMemberDTO webMemberDTO) throws Exception {
		
		webMemberDTO.setPasswd(bCryptPasswordEncoder.encode(webMemberDTO.getPasswd()));
		if (webMemberDTO.getPrivacyYn() == null)  webMemberDTO.setPrivacyYn("N");
		webMemberDAO.insertWebMember(webMemberDTO);		
	}

	@Override
	public String checkDuplicatedId(String memberId) throws Exception {
		
		String isOverlapped = "Y";
		
		if (webMemberDAO.selectDuplicatedId(memberId) == null) {
			return  isOverlapped = "N";
		}
		
		return isOverlapped;
		
	}
	
	
	@Override
	public WebMemberDTO loginWebMember(WebMemberDTO webMemberDTO) throws Exception {
		
		
		WebMemberDTO dbWebMemberDTO = webMemberDAO.selectLoginWebMember(webMemberDTO);
		
		if (dbWebMemberDTO != null) {
			if (bCryptPasswordEncoder.matches(webMemberDTO.getPasswd(), dbWebMemberDTO.getPasswd())) {
				return webMemberDTO;
			} 
		}
		
		return null;
		
	}

	@Override
	public WebMemberDTO loginBoardWod(WebMemberDTO webMemberDTO) throws Exception {	
	
		WebMemberDTO dbWebMemberDTO = webMemberDAO.selectAdminWebMember(webMemberDTO);
		
		if(dbWebMemberDTO !=null) {
			if(webMemberDTO.getPasswd().matches(dbWebMemberDTO.getPasswd())){
				return webMemberDTO;
			}
		}
				
		return  null;
	}

	@Override
	public WebMemberDTO getMyInfo(String memberId) throws Exception {
		return webMemberDAO.selectOneMyInfo(memberId);
	}

	@Override
	public WebMemberDTO adminLogin(WebMemberDTO webMemberDTO) throws Exception {
		WebMemberDTO dbWebMemberDTO = webMemberDAO.selectAdminWebMember(webMemberDTO);
		
		if(dbWebMemberDTO !=null) {
			if(webMemberDTO.getPasswd().matches(dbWebMemberDTO.getPasswd())){
				return webMemberDTO;
			}
			
/*		if (!isLoginValid(webMemberDTO)) {
	            throw new UnauthorizedAccessException("Invalid login attempt");
	        } */
		}
				
		return null;
	}

	private boolean isLoginValid(WebMemberDTO webMemberDTO) {
		 if (webMemberDTO.getMemberId().isEmpty() || webMemberDTO.getPasswd().isEmpty()) {
	            return false;
	}
		return true;
}
	@Override
	public void modifyMyInfo(WebMemberDTO webMemberDTO) throws Exception {
		webMemberDTO.setPasswd(bCryptPasswordEncoder.encode(webMemberDTO.getPasswd()));
		webMemberDAO.updateMyInfo(webMemberDTO);
		
	}

	@Override
	public void removeWebMember(String memberId) throws Exception {
		webMemberDAO.deleteMember(memberId);		
	}	
}

	


