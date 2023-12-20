package com.application.coms.contact.controller.dao;

import com.application.coms.contact.dto.ContactDTO;

public interface ContactDAO {

	public void insertContact(ContactDTO contactDTO)throws Exception;

}
