package com.application.coms.admin.gymMembership.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.gymMembership.dto.GymMembershipDTO;
import com.application.coms.admin.gymMembership.service.GymMembershipService;
import com.application.coms.admin.gymmember.dto.GymMemberDTO;


@Controller
@RequestMapping("/admin/membership")
public class GymMembershipController {

	@Autowired
	private GymMembershipService gymMembershipService;
	
	@GetMapping("/signup")
	public ModelAndView register(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/membership/signup");
				
		return mv;
		
	}	
	
	@PostMapping("/signup")
	public String register(HttpServletRequest request, GymMembershipDTO gymMembershipDTO, GymMemberDTO gymMemberDTO) throws Exception {
		
		String uuid=UUID.randomUUID().toString();
		gymMembershipDTO.setUuid(uuid);
		
		gymMembershipService.addGymMember(gymMembershipDTO, gymMemberDTO);
		return "/adminNotify";		

	}

	@GetMapping("/paymentHistory")
	public ModelAndView paymentHistoryList(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/membership/paymentHistory");
				
		return mv;
		
	}	
	
	@PostMapping("/paymentHistory")
	public ModelAndView paymentHistoryList(@RequestParam("keyword") String keyword, HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/membership/paymentHistory");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		mv.addObject("paymentHistoryList" , gymMembershipService.getPaymentHistory(map));

		
		return mv;
		
	}
	
	@Scheduled (cron="0 0 15 * * *")	 //@Scheduled(cron="0 0 0 ? * SUN")	 	 > 매주 일요일 15시에 실행
	@GetMapping("/expireScheduledList")
	public ModelAndView expireScheduledList() throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/membership/expireScheduledList");
		
		mv.addObject("memberExpireScheduledList" , gymMembershipService.getexpireScheduledList());
				
		return mv;
	
	}	
	
	@GetMapping("/expiredMemberList")
	public ModelAndView expiredMemberList(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/membership/expiredMemberList");
		System.out.println(gymMembershipService.getExpiredMemberList());
		mv.addObject("expiredMemberList" , gymMembershipService.getExpiredMemberList());
		
		return mv;
	
	}	
	
}
