package com.application.coms.admin.contact.dao;

import java.util.List;

import com.application.coms.contact.dto.ContactDTO;

public interface AdminContactDAO {

	public List<ContactDTO> selectListContact()throws Exception;
	public ContactDTO selectOneContact(String uuid)throws Exception;
	public void deleteContact(String[] deleteContactUuidList)throws Exception;
}
