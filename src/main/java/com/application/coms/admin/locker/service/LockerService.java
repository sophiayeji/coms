package com.application.coms.admin.locker.service;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.locker.dto.LockerDTO;

public interface LockerService {
	public void addlocker(LockerDTO lockerDTO, GymMemberDTO gymMemberDTO)throws Exception;
	public List<LockerDTO> getLockerInfo(Map<String, Object> map)throws Exception;

}
