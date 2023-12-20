package com.application.coms.admin.gymmember.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.gymmember.service.GymMemberService;



@Controller
@RequestMapping("/admin/gymMember")
public class GymMemberController {
	
	@Autowired
	private GymMemberService gymMemberService;
	
	@GetMapping("/newRegister")
	public ModelAndView newRegister(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/gymMember/newRegister");
	
		
		return mv;
	}
	
	@PostMapping("/newRegister")
	public String newRegister(HttpServletRequest request, GymMemberDTO gymMemberDTO) throws Exception {
		
		String memberId = (UUID.randomUUID().toString()).substring(1, 12);
		gymMemberDTO.setMemberId(memberId);
		
		
		gymMemberService.addGymMember(gymMemberDTO);
		return "/adminNotify";		

	}

	@GetMapping("/gymMemberSearch")
	public ModelAndView gymMemberSearch(HttpServletRequest request)throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/gymMember/gymMemberSearch");
			
		return mv;
				
	}
	
	@PostMapping("/gymMemberSearch")
	public ModelAndView gymMemberSearch(@RequestParam("keyword") String keyword, HttpServletRequest request)throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/gymMember/gymMemberSearch");
				
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		mv.addObject("gymMemberList", gymMemberService.getGymMemberInfo(map));
		System.out.println(gymMemberService.getGymMemberInfo(map));
		
		
		return mv;		
				
	}
	
	

}


	
	
	

