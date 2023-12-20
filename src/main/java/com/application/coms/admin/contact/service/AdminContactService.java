package com.application.coms.admin.contact.service;

import java.util.List;

import com.application.coms.contact.dto.ContactDTO;

public interface AdminContactService {

	public List<ContactDTO> getContactList() throws Exception;
	public ContactDTO getContactDetail(String uuid) throws Exception;
	public void removeContact(String[] deleteContactUuidList)throws Exception;
}
