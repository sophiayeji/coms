package com.application.coms.admin.recess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.coms.admin.recess.dao.RecessDAO;
import com.application.coms.admin.recess.dto.RecessDTO;
import com.application.coms.admin.gymmember.dao.GymMemberDAO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;


@Service
public class RecessServiceImpl implements RecessService {
	
	@Autowired
	private RecessDAO recessDAO;
	
	@Autowired
	private GymMemberDAO gymMemberDAO;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRegister(RecessDTO recessDTO, GymMemberDTO gymMemberDTO) throws Exception {
		
		GymMemberDTO encodedMemberId = gymMemberDAO.selectOneMemberId(gymMemberDTO.getMemberId());
	    String rawMemberId = recessDTO.getMemberId();

	    //// Log rawMemberId and encodedMemberId for debugging
	    System.out.println("rawMemberId: " + rawMemberId);
	    System.out.println("encodedMemberId: " + (encodedMemberId != null ? encodedMemberId.getMemberId() : "null"));

	    if (encodedMemberId == null) {
	        throw new RuntimeException("Simulated exception for testing rollback");
	    } else if (rawMemberId.equals(encodedMemberId.getMemberId())) {
	    	recessDAO.insertRegister(recessDTO);
	     
	    	//// Log success message after inserting gym membership
	        System.out.println("After inserting gym membership");
	    }
}
		


	@Override
	public List<RecessDTO> getRecessMemberList() throws Exception {
		return recessDAO.seletRecessMemberList();
	}

}
