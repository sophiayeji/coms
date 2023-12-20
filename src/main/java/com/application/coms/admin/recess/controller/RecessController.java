package com.application.coms.admin.recess.controller;



import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.recess.dto.RecessDTO;
import com.application.coms.admin.recess.service.RecessService;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;


@Controller
@RequestMapping("/admin/recess")
public class RecessController {

	@Autowired
	private RecessService recessService;
	
@GetMapping("/register") 
 public ModelAndView register() throws Exception {
				
	ModelAndView mv = new ModelAndView();  			
	mv.setViewName("/admin/recess/register");
			
				
	return mv;
}	
@PostMapping("/register")
	public String register(HttpServletRequest request, RecessDTO recessDTO, GymMemberDTO gymMemberDTO) throws Exception {
	
	HttpSession session = request.getSession();
	
	String uuid=UUID.randomUUID().toString();
	recessDTO.setUuid(uuid);
	
	recessService.addRegister(recessDTO, gymMemberDTO);
	
	return "/adminNotify";		

}
@GetMapping("/recessMemberList")
public ModelAndView recessMemberList(HttpServletRequest request)throws Exception {
	
	HttpSession session = request.getSession();
	
	ModelAndView mv = new ModelAndView();  			
	mv.setViewName("/admin/recess/recessMemberList");
	mv.addObject("recessMemberList", recessService.getRecessMemberList());
	
	return mv;
			
}
		
		
	
}
