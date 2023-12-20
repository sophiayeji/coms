package com.application.coms.expclass.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.expclass.dto.ExpClassDTO;

@Repository
public class ExpClassDAOImpl implements ExpClassDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertExpClass(ExpClassDTO expClassDTO) throws Exception {
		sqlSession.insert("expClass.insertExpClass" , expClassDTO);		
		
	}

	@Override
	public ExpClassDTO selectOneMyInfo(String memberId) throws Exception {
		return sqlSession.selectOne("expClass.selectOneMyInfo",memberId);
	}

	@Override
	public List<ExpClassDTO> selectExpClassList() throws Exception {
		return sqlSession.selectList("expClass.selectExpClassList");
	}

	@Override
	public int seletAllOrderCnt() throws Exception {
		return sqlSession.selectOne("expClass.selectOneAllOrderCnt");
	}

	@Override
	public ExpClassDTO selectOneOrder(String uuid) throws Exception {
		return sqlSession.selectOne("expClass.selectOneOrder" , uuid);
	}

	@Override
	public void insertApprovalYn(ExpClassDTO expClassDTO) throws Exception {
		sqlSession.insert("expClass.insertApprovalYn", expClassDTO);
		
	}

	@Override
	public List<ExpClassDTO> selectExpClassPaymentList() throws Exception {
		return sqlSession.selectList("expClass.selectPaymentList");
	}


}
