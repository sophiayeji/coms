package com.application.coms.admin.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.coms.admin.contact.dao.AdminContactDAO;
import com.application.coms.contact.dto.ContactDTO;


@Service
public class AdminContactServiceImpl implements AdminContactService{

	@Autowired
	private AdminContactDAO adminContactDAO;
	
	
	@Override
	public List<ContactDTO> getContactList() throws Exception {
		return adminContactDAO.selectListContact();
	}

	@Override
	public ContactDTO getContactDetail(String uuid) throws Exception {
		return adminContactDAO.selectOneContact(uuid);
	}

	@Override
	public void removeContact(String[] deleteContactUuidList) throws Exception {
		adminContactDAO.deleteContact(deleteContactUuidList);		
	}
}
