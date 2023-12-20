package com.application.coms.admin.gymmember.service;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;

public interface GymMemberService {

	public void addGymMember(GymMemberDTO gymMemberDTO)throws Exception;
	public void removeGymMember(GymMemberDTO gymMemberDTO) throws Exception;
	public List<GymMemberDTO> getGymMemberInfo(Map<String, Object> map)throws Exception;
	public GymMemberDTO getGymMemberDetail(String memberId)throws Exception;
	
}
