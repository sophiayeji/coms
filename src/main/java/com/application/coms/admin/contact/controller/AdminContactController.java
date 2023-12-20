package com.application.coms.admin.contact.controller;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.contact.service.AdminContactService;


@Controller
@RequestMapping("admin/contact")
public class AdminContactController {

	@Autowired
	private AdminContactService adminContactService;
	private Object messageService;
	
	@GetMapping("/contactList")
	public ModelAndView contactList() throws Exception{
		ModelAndView mv = new ModelAndView("/admin/contact/contactList");
		mv.addObject("contactList" , adminContactService.getContactList());
		return mv;
	}
	
	@GetMapping("/contactDetail")
	public ModelAndView contactDetail(@RequestParam("uuid") String uuid) throws Exception{
		ModelAndView mv = new ModelAndView("/admin/contact/contactDetail");
		mv.addObject("contactDTO" , adminContactService.getContactDetail(uuid));
		return mv;
	}
	
	@GetMapping("/removeContact")
	public String removeCart(@RequestParam("contactUuidList") String contactUuidList) throws Exception {
		
		String[] temp = contactUuidList.split(",");
		String[] deleteUuidList = new String[temp.length];

		for (int i = 0; i < temp.length; i++) {
			deleteUuidList[i] = temp[i];
		}
		
		adminContactService.removeContact(deleteUuidList);
				
		return "/adminNotify";		
	}
	
	
   }


