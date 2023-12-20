package com.application.coms.admin.gymmemberpic.service;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.gymmemberpic.dto.GymMemberPicDTO;

public interface GymMemberPicService {

	public void addGymMemberPic(GymMemberPicDTO gymMemberPicDTO, GymMemberDTO gymMemberDTO)throws Exception;
	

}
