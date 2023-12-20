package com.application.coms.admin.locker.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.admin.locker.dao.LockerDAO;
import com.application.coms.admin.locker.dto.LockerDTO;
import com.application.coms.admin.gymmember.dao.GymMemberDAO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;

@Service
public class LockerServiceImpl implements LockerService {

	@Autowired
	private LockerDAO lockerDAO;
	
	@Autowired
	private GymMemberDAO gymMemberDAO;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addlocker(LockerDTO lockerDTO, GymMemberDTO gymMemberDTO) throws Exception {
		
		GymMemberDTO encodedMemberId = gymMemberDAO.selectOneMemberId(gymMemberDTO.getMemberId());
	    String rawMemberId = lockerDTO.getMemberId();

	    //// Log rawMemberId and encodedMemberId for debugging
	    System.out.println("rawMemberId: " + rawMemberId);
	    System.out.println("encodedMemberId: " + (encodedMemberId != null ? encodedMemberId.getMemberId() : "null"));

	    if (encodedMemberId == null) {
	        throw new RuntimeException("Simulated exception for testing rollback");
	    } else if (rawMemberId.equals(encodedMemberId.getMemberId())) {
	    	lockerDAO.insertLocker(lockerDTO);	
	       
	    	//// Log success message after inserting gym membership
	        System.out.println("After inserting gym membership");
	    }
				
	}

	@Override
	public List<LockerDTO> getLockerInfo(Map<String, Object> map) throws Exception {
		return lockerDAO.selectSearchLocker(map);
	}

}
