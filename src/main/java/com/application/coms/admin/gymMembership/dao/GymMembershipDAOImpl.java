package com.application.coms.admin.gymMembership.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.admin.gymMembership.dto.GymMembershipDTO;

@Repository
public class GymMembershipDAOImpl implements GymMembershipDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertGymMembership(GymMembershipDTO gymMembershipDTO) throws Exception {
		sqlSession.insert("Membership.insertGymMembership", gymMembershipDTO);
		
	}

	@Override
	public List<Map<String, Object>> selectListPaymentHistory(Map<String, Object> map) {
		return sqlSession.selectList("Membership.selectListPaymentHistory" , map);
		
	}

	@Override
	public List<GymMembershipDTO> selectListExpireScheduled() throws Exception {
		return sqlSession.selectList("Membership.selectListExpireScheduled");
	}
	
	@Override
	public List<GymMembershipDTO> selectListexpiredMemberList() throws Exception {
		return sqlSession.selectList("Membership.selectListexpiredMemberList");
	}

	
	
	
}
