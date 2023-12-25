package com.application.coms.webmember.dao;

import org.springframework.stereotype.Repository;

import com.application.coms.webmember.dto.WebMemberDTO;


@Repository
public interface WebMemberDAO {

	public void insertWebMember(WebMemberDTO webMemberDTO)throws Exception;
	public WebMemberDTO selectDuplicatedId(String memberId) throws Exception;
	public WebMemberDTO selectLoginWebMember(WebMemberDTO webMemberDTO)throws Exception;
	public WebMemberDTO selectAdminWebMember(WebMemberDTO webMemberDTO)throws Exception;
	public WebMemberDTO selectOneMyInfo(WebMemberDTO webMemberDTO) throws Exception;
	public WebMemberDTO selectOneMyInfo(String memberId)throws Exception;
	public void updateMyInfo(WebMemberDTO webMemberDTO)throws Exception;
	public void deleteMember(String memberId)throws Exception;
	public WebMemberDTO selectOneVerifyNum(String verifyNum)throws Exception;
}
