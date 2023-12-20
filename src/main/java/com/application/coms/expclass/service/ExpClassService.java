package com.application.coms.expclass.service;

import java.util.List;

import com.application.coms.expclass.dto.ExpClassDTO;

public interface ExpClassService {

	public void addExpClass(ExpClassDTO expClassDTO) throws Exception;
	public ExpClassDTO getMyInfo(String memeberId)throws Exception;
	public List<ExpClassDTO> getExpClassList()throws Exception;
	public int getAllOrderCnt() throws Exception;
	public ExpClassDTO getOrderDetail(String uuid)throws Exception;
	public void addApprovalYn(ExpClassDTO expClassDTO)throws Exception;
	public List<ExpClassDTO> getPaymentHistory()throws Exception;
}
