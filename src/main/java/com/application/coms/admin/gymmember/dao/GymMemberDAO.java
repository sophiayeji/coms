package com.application.coms.admin.gymmember.dao;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;

public interface GymMemberDAO {

	public void insertGymMember(GymMemberDTO gymMemberDTO)throws Exception;
	public void deleteGymMember(GymMemberDTO gymMemberDTO) throws Exception;
	public List<GymMemberDTO> selectSearchGymMember(Map<String, Object> map)throws Exception;
	public GymMemberDTO selectOneInfo(String memberId)throws Exception;
	public GymMemberDTO selectOneMemberId(String memberId)throws Exception;	
}