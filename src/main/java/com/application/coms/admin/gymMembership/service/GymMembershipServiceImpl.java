package com.application.coms.admin.gymMembership.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.admin.gymMembership.dao.GymMembershipDAO;
import com.application.coms.admin.gymMembership.dto.GymMembershipDTO;
import com.application.coms.admin.gymmember.dao.GymMemberDAO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;



@Service
public class GymMembershipServiceImpl implements GymMembershipService {

	@Autowired
	private GymMembershipDAO gymMembershipDAO;
	
	@Autowired
	private GymMemberDAO gymMemberDAO;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addGymMember(GymMembershipDTO gymMembershipDTO, GymMemberDTO gymMemberDTO) throws Exception {
		
		
		 	GymMemberDTO encodedMemberId = gymMemberDAO.selectOneMemberId(gymMemberDTO.getMemberId());
		    String rawMemberId = gymMembershipDTO.getMemberId();

		    //// Log rawMemberId and encodedMemberId for debugging
		    System.out.println("rawMemberId: " + rawMemberId);
		    System.out.println("encodedMemberId: " + (encodedMemberId != null ? encodedMemberId.getMemberId() : "null"));

		    if (encodedMemberId == null) {
		        throw new RuntimeException("Simulated exception for testing rollback");
		    } else if (rawMemberId.equals(encodedMemberId.getMemberId())) {
		        gymMembershipDAO.insertGymMembership(gymMembershipDTO);
		     
		        ////  Log success message after inserting gym membership
		        System.out.println("After inserting gym membership");
		    }
	}

	@Override
	public List<Map<String, Object>> getPaymentHistory(Map<String, Object> map) throws Exception {
		return gymMembershipDAO.selectListPaymentHistory(map);

	}
	
	@Override
	public List<GymMembershipDTO> getexpireScheduledList() throws Exception {
		return gymMembershipDAO.selectListExpireScheduled();
		//관리자 문자전송기능 만들기
	}
	
	@Override
	public List<GymMembershipDTO> getExpiredMemberList() throws Exception {
		// TODO Auto-generated method stub
		return gymMembershipDAO.selectListexpiredMemberList();
	}
}
	

