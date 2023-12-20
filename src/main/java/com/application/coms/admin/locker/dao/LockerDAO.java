package com.application.coms.admin.locker.dao;

import java.util.List;
import java.util.Map;

import com.application.coms.admin.locker.dto.LockerDTO;

public interface LockerDAO {

	public void insertLocker(LockerDTO lockerDTO)throws Exception;
	public List<LockerDTO> selectSearchLocker(Map<String, Object> map)throws Exception;

}
