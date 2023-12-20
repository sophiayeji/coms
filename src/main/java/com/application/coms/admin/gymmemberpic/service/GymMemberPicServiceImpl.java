package com.application.coms.admin.gymmemberpic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.admin.gymmemberpic.dao.GymMemberPicDAO;
import com.application.coms.admin.gymmemberpic.dto.GymMemberPicDTO;
import com.application.coms.admin.gymmember.dao.GymMemberDAO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;

@Service
public class GymMemberPicServiceImpl implements GymMemberPicService  {

	@Autowired
	private GymMemberPicDAO gymMemberPicDAO;
	
	@Autowired
	private GymMemberDAO gymMemberDAO;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addGymMemberPic(GymMemberPicDTO gymMemberPicDTO, GymMemberDTO gymMemberDTO) throws Exception {
		
		GymMemberDTO encodedMemberId = gymMemberDAO.selectOneMemberId(gymMemberDTO.getMemberId());
	    String rawMemberId = gymMemberPicDTO.getMemberId();

	    //// Log rawMemberId and encodedMemberId for debugging
	    System.out.println("rawMemberId: " + rawMemberId);
	    System.out.println("encodedMemberId: " + (encodedMemberId != null ? encodedMemberId.getMemberId() : "null"));

	    if (encodedMemberId == null) {
	        throw new RuntimeException("Simulated exception for testing rollback");
	    } else if (rawMemberId.equals(encodedMemberId.getMemberId())) {
	    	gymMemberPicDAO.insertMemberPic(gymMemberPicDTO);	
	       
	    	//// Log success message after inserting gym membership
	        System.out.println("After inserting gym membership");
	    }
		
			
	}
}
