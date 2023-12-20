package com.application.coms.admin.gymMembership.dao;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.gymMembership.dto.GymMembershipDTO;

public interface GymMembershipDAO {

	public void insertGymMembership(GymMembershipDTO gymMembershipDTO)throws Exception;
	public List<Map<String, Object>> selectListPaymentHistory(Map<String, Object> map)throws Exception;
	public List<GymMembershipDTO> selectListExpireScheduled()throws Exception;
	public List<GymMembershipDTO> selectListexpiredMemberList()throws Exception;
	
}
