package com.application.coms.venuerent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.venuerent.dao.VenueRentDAO;
import com.application.coms.venuerent.dto.VenueRentDTO;

@Service
public class VenueRentServiceImpl implements VenueRentService{

	@Autowired
	private VenueRentDAO venueRentDAO;
	
	@Override
	public void addRentVenue(VenueRentDTO venueRentDTO) throws Exception {
		venueRentDAO.insertVenueRent(venueRentDTO);
		
	}

	@Override
	public VenueRentDTO getMyInfo(String memberId) throws Exception {
		return venueRentDAO.selectOneMyInfo(memberId);
	}

	@Override
	public List<VenueRentDTO> getvenueRentList() throws Exception {
		return venueRentDAO.selectvenueRentList();
	}

	@Override
	public int getAllOrderCnt() throws Exception {
		return venueRentDAO.seletAllOrderCnt();
	}

	@Override
	public VenueRentDTO getOrderDetail(String uuid) throws Exception {
		return venueRentDAO.selectOneOrder(uuid);
	}

	@Override
	public void addApprovalYn(VenueRentDTO venueRentDTO) throws Exception {
		venueRentDAO.insertApprovalYn(venueRentDTO);
		
	}

	@Override
	public List<VenueRentDTO> getPaymentHistory() throws Exception {
		return venueRentDAO.selectExpClassPaymentList();
	}

}
