package com.application.coms.admin.gymMembership.service;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.gymMembership.dto.GymMembershipDTO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;

public interface GymMembershipService {

	public void addGymMember(GymMembershipDTO gymMembershipDTO, GymMemberDTO gymMemberDTO) throws Exception;	
	public List<Map<String,Object>> getPaymentHistory(Map<String, Object> map)throws Exception;
	public List<GymMembershipDTO> getexpireScheduledList()throws Exception;
	public List<GymMembershipDTO> getExpiredMemberList()throws Exception;

}
