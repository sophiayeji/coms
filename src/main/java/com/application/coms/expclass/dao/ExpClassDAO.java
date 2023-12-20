package com.application.coms.expclass.dao;

import java.util.List;

import com.application.coms.expclass.dto.ExpClassDTO;

public interface ExpClassDAO {

	public void insertExpClass(ExpClassDTO expClassDTO)throws Exception;
	public ExpClassDTO selectOneMyInfo(String memberId)throws Exception;
	public List<ExpClassDTO> selectExpClassList()throws Exception;
	public int seletAllOrderCnt()throws Exception;
	public ExpClassDTO selectOneOrder(String uuid)throws Exception;
	public void insertApprovalYn(ExpClassDTO expClassDTO)throws Exception;
	public List<ExpClassDTO> selectExpClassPaymentList()throws Exception;
	
}
