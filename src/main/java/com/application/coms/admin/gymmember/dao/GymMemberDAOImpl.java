package com.application.coms.admin.gymmember.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;

@Repository
public class GymMemberDAOImpl implements GymMemberDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertGymMember(GymMemberDTO gymMemberDTO) throws Exception {
		sqlSession.insert("gymMember.insertGymMember", gymMemberDTO);
	
	}

	@Override
	public void deleteGymMember(GymMemberDTO gymMemberDTO) throws Exception {
		sqlSession.delete("gymMember.deleteGymMember", gymMemberDTO);
		
	}


	@Override
	public List<GymMemberDTO> selectSearchGymMember(Map<String, Object> map) throws Exception {
		return sqlSession.selectList("gymMember.SearchGymMember",map);
		
	}

	@Override
	public GymMemberDTO selectOneInfo(String memberId) throws Exception {
		return sqlSession.selectOne("gymMember.selectOneGymMember", memberId);
	}

	@Override
	public GymMemberDTO selectOneMemberId(String memberId) throws Exception {
		return sqlSession.selectOne("gymMember.selectOneGymMemberId", memberId);
	}

	
	
	

}
