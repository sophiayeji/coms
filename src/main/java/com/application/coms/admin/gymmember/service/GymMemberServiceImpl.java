package com.application.coms.admin.gymmember.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.coms.admin.gymmember.dao.GymMemberDAO;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;

@Service
public class GymMemberServiceImpl implements GymMemberService {

	@Autowired
	private GymMemberDAO gymMemberDAO;

	@Override
	public void addGymMember(GymMemberDTO gymMemberDTO) throws Exception {
		gymMemberDAO.insertGymMember(gymMemberDTO);		
		
	}

	@Override
	public void removeGymMember(GymMemberDTO gymMemberDTO) throws Exception {
		gymMemberDAO.deleteGymMember(gymMemberDTO);
		
	}

	@Override
	public List<GymMemberDTO> getGymMemberInfo(Map<String, Object> map) throws Exception {
		return gymMemberDAO.selectSearchGymMember(map);
	}

	@Override
	public GymMemberDTO getGymMemberDetail(String memberId) throws Exception {
		return gymMemberDAO.selectOneInfo(memberId);
	}	
}
