package com.application.coms.venuerent.service;

import java.util.List;

import com.application.coms.venuerent.dto.VenueRentDTO;

public interface VenueRentService {

	public void addRentVenue(VenueRentDTO venueRentDTO)throws Exception;
	public VenueRentDTO getMyInfo(String memberId)throws Exception;
	public List<VenueRentDTO> getvenueRentList()throws Exception;
	public int getAllOrderCnt()throws Exception;
	public VenueRentDTO getOrderDetail(String uuid)throws Exception;
	public void addApprovalYn(VenueRentDTO venueRentDTO)throws Exception;
	public List<VenueRentDTO> getPaymentHistory()throws Exception;

}
