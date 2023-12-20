package com.application.coms.webmember.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.webmember.dto.WebMemberDTO;

@Repository
public class WebMemberDAOImpl implements WebMemberDAO {

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public void insertWebMember(WebMemberDTO webMemberDTO) throws Exception {
		sqlSession.insert("webmember.insertWebMember" , webMemberDTO);		
	}

	@Override
	public WebMemberDTO selectDuplicatedId(String memberId) throws Exception {
		return sqlSession.selectOne("webmember.selectDuplicatedId" ,memberId);
	}

	@Override
	public WebMemberDTO selectLoginWebMember(WebMemberDTO webMemberDTO) throws Exception {
		return sqlSession.selectOne("webmember.selectLoginWebMember", webMemberDTO );
	}

	@Override
	public WebMemberDTO selectAdminWebMember(WebMemberDTO webMemberDTO) throws Exception {
		return sqlSession.selectOne("webmember.selectAdminWebMember", webMemberDTO );
	}

	@Override
	public WebMemberDTO selectOneMyInfo(WebMemberDTO webMemberDTO) throws Exception {
		return sqlSession.selectOne("webmember.selectOneMyInfo",webMemberDTO);
	}

	@Override
	public WebMemberDTO selectOneMyInfo(String memberId) throws Exception {
		return sqlSession.selectOne("webmember.selectOneMyInfo",memberId);
	}

	@Override
	public void updateMyInfo(WebMemberDTO webMemberDTO) throws Exception {
		sqlSession.update("webmember.updateMyInfo", webMemberDTO);	
	}

	@Override
	public void deleteMember(String memberId) throws Exception {
		sqlSession.delete("webmember.deleteMember" , memberId);
	}
	
}
