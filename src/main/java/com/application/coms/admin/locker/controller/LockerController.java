package com.application.coms.admin.locker.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.locker.dto.LockerDTO;
import com.application.coms.admin.locker.service.LockerService;

@Controller
@RequestMapping("/admin/locker")
public class LockerController {
	
	@Autowired
	private LockerService lockerService;
	

	@GetMapping("/register") 
	 public ModelAndView register(HttpServletRequest request) throws Exception {
					
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/locker/register");
				
					
		return mv;
	}	
	
	@PostMapping("/register")
	public String register(HttpServletRequest request, LockerDTO lockerDTO, GymMemberDTO gymMemberDTO) throws Exception {
	
	HttpSession session = request.getSession();
	
	String uuid=UUID.randomUUID().toString();
	lockerDTO.setUuid(uuid);
	
	lockerService.addlocker(lockerDTO, gymMemberDTO);
	return "/adminNotify";		

}
	/*
	@GetMapping("/modify")
	public ModelAndView modify(@RequestParam("memberId") String memberId) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/locker/modifyBoard");
		
		mv.addObject("locekrDTO" , lockerService.getLockerDetail(memberId));
		
		return mv;
		
	}*/
	
	@GetMapping("/lockerSearch")
	public ModelAndView lockerSearch(HttpServletRequest request)throws Exception {
		
		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/locker/lockerSearch");
			
		return mv;
				
	}
	
	@PostMapping("/lockerSearch")
	public ModelAndView lockerSearch(@RequestParam("keyword") String keyword, HttpServletRequest request)throws Exception {
		
		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/locker/lockerSearch");
				
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		mv.addObject("lockerList", lockerService.getLockerInfo(map));
		System.out.println(lockerService.getLockerInfo(map));
		
		return mv;		
				
	}

}
