package com.application.coms.admin.recess.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.admin.recess.dto.RecessDTO;

@Repository
public class RecessDAOImpl implements RecessDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertRegister(RecessDTO recessDTO) throws Exception {
		sqlSession.insert("Recess.insertRegister", recessDTO);
		
	}

	@Override
	public List<RecessDTO> seletRecessMemberList() throws Exception {
		return sqlSession.selectList("Recess.selectRecessMemberList");
	}

}
