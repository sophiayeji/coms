package com.application.coms.admin.recess.dao;

import java.util.List;

import com.application.coms.admin.recess.dto.RecessDTO;

public interface RecessDAO {

	public void insertRegister(RecessDTO recessDTO)throws Exception;
	public List<RecessDTO> seletRecessMemberList()throws Exception;
}
