package com.application.coms.expclass.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.expclass.dao.ExpClassDAO;
import com.application.coms.expclass.dto.ExpClassDTO;




@Service
public class ExpClassServiceImpl implements ExpClassService  {

	@Autowired
	private ExpClassDAO expClassDAO;

	@Override
	public void addExpClass(ExpClassDTO expClassDTO) throws Exception {
		expClassDAO.insertExpClass(expClassDTO);
	}

	@Override
	public ExpClassDTO getMyInfo(String memberId) throws Exception {
		return expClassDAO.selectOneMyInfo(memberId);
	}

	@Override
	public List<ExpClassDTO> getExpClassList() throws Exception {
		return expClassDAO.selectExpClassList();
	}

	@Override
	public int getAllOrderCnt()throws Exception {
		return expClassDAO.seletAllOrderCnt();
	}

	@Override
	public ExpClassDTO getOrderDetail(String uuid) throws Exception {
		return expClassDAO.selectOneOrder(uuid);
	}

	@Override
	public void addApprovalYn(ExpClassDTO expClassDTO) throws Exception {
		expClassDAO.insertApprovalYn(expClassDTO);
		
	}

	@Override
	public List<ExpClassDTO> getPaymentHistory() throws Exception {
		return expClassDAO.selectExpClassPaymentList();
	}



	 		
}

