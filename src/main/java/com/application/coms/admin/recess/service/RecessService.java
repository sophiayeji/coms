package com.application.coms.admin.recess.service;

import java.util.List;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.recess.dto.RecessDTO;

public interface RecessService {

	public void addRegister(RecessDTO recessDTO, GymMemberDTO gymMemberDTO)throws Exception;
	public List<RecessDTO> getRecessMemberList()throws Exception;
	
}
