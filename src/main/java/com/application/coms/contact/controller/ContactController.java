package com.application.coms.contact.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.contact.dto.ContactDTO;
import com.application.coms.contact.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
		
	@GetMapping("/addContact")
	public ModelAndView contact() throws Exception {
		return new ModelAndView("/contact/addContact");		
	}
	
	@PostMapping("/addContact")
	public String contact(ContactDTO contactDTO,HttpServletRequest request)throws Exception{
		

		String uuid=UUID.randomUUID().toString();
		contactDTO.setUuid(uuid);
				
		contactService.addNewContact(contactDTO);
		return "/contact/notifyResister";	
			
	}
	
}
