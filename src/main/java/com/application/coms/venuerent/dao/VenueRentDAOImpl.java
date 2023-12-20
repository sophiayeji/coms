package com.application.coms.venuerent.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.venuerent.dto.VenueRentDTO;

@Repository
public class VenueRentDAOImpl implements VenueRentDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertVenueRent(VenueRentDTO venueRentDTO) throws Exception {
		sqlSession.insert("venueRent.insertVenueRent" , venueRentDTO);	
		
	}

	@Override
	public VenueRentDTO selectOneMyInfo(String memberId) throws Exception {
		return sqlSession.selectOne("venueRent.selectOneMyInfo",memberId);
	}

	@Override
	public List<VenueRentDTO> selectvenueRentList() throws Exception {
		return sqlSession.selectList("venueRent.selectvenueRentList");
	}

	@Override
	public int seletAllOrderCnt() throws Exception {
		return sqlSession.selectOne("venueRent.selectOneAllOrderCnt");
	}

	@Override
	public VenueRentDTO selectOneOrder(String uuid) throws Exception {
		return sqlSession.selectOne("venueRent.selectOneOrder" , uuid);
	}

	@Override
	public void insertApprovalYn(VenueRentDTO venueRentDTO) throws Exception {
		sqlSession.insert("venueRent.insertApprovalYn", venueRentDTO);
		
	}

	@Override
	public List<VenueRentDTO> selectExpClassPaymentList() throws Exception {
		return sqlSession.selectList("venueRent.selectPaymentList");
	}

}
