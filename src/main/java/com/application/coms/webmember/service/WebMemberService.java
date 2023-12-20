package com.application.coms.webmember.service;


import com.application.coms.webmember.dto.WebMemberDTO;
public interface WebMemberService {
	
	public void addWebMember(WebMemberDTO webMemberDTO) throws Exception;
	public String checkDuplicatedId(String memberId) throws Exception;
	public WebMemberDTO loginWebMember(WebMemberDTO webMemberDTO) throws Exception;
	public WebMemberDTO loginBoardWod(WebMemberDTO webMemberDTO)throws Exception;
	public WebMemberDTO getMyInfo(String memberId)throws Exception;
	public WebMemberDTO adminLogin(WebMemberDTO webMemberDTO)throws Exception;
	public void modifyMyInfo(WebMemberDTO webMemberDTO)throws Exception;
	public void removeWebMember(String memberId)throws Exception;

}


