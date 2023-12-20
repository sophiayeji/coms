package com.application.coms.venuerent.dao;

import java.util.List;

import com.application.coms.venuerent.dto.VenueRentDTO;

public interface VenueRentDAO {

	public void insertVenueRent(VenueRentDTO venueRentDTO)throws Exception;
	public VenueRentDTO selectOneMyInfo(String memberId)throws Exception;
	public List<VenueRentDTO> selectvenueRentList()throws Exception;
	public int seletAllOrderCnt()throws Exception;
	public VenueRentDTO selectOneOrder(String uuid)throws Exception;
	public void insertApprovalYn(VenueRentDTO venueRentDTO)throws Exception;
	public List<VenueRentDTO> selectExpClassPaymentList()throws Exception;


	
}
