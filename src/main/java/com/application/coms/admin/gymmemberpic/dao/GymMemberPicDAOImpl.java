package com.application.coms.admin.gymmemberpic.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.admin.gymmemberpic.dto.GymMemberPicDTO;

@Repository
public class GymMemberPicDAOImpl implements GymMemberPicDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertMemberPic(GymMemberPicDTO gymMemberPicDTO) throws Exception {
		sqlSession.insert("gymMemberPic.insertGymMemberPic", gymMemberPicDTO);
		
	}

}
