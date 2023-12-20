package com.application.coms.myPage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.expclass.service.ExpClassService;
import com.application.coms.venuerent.service.VenueRentService;
import com.application.coms.webmember.dto.WebMemberDTO;
import com.application.coms.webmember.service.WebMemberService;


@Controller
@RequestMapping("/myPage")
public class MyPageContoller {
	
	@Autowired
	private WebMemberService webMemberService;
	
	@Autowired
	private ExpClassService expClassService;
	
	@Autowired
	private VenueRentService venueRentService;
		
	@GetMapping("/myInfo")
	public ModelAndView myInfo(HttpServletRequest request) throws Exception {

		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/myPage/myInfo");
		
		HttpSession session = request.getSession();
		mv.addObject("webMemberDTO", webMemberService.getMyInfo((String)session.getAttribute("memberId")));
			
		return mv;	
	}
	
	@PostMapping("/modifyInfo")
	public String modifyInfo(WebMemberDTO webMemberDTO, HttpServletRequest request)throws Exception {
	
		webMemberService.modifyMyInfo(webMemberDTO);
		return "/webmember/notifyModify";			
	}
		
	@GetMapping("/removeWebMember")
	public String removeWebMember(String memberId, WebMemberDTO webMemberDTO, HttpServletRequest request)throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate(); 
		
		webMemberService.removeWebMember(memberId);
	
		
		return "/webmember/removeWebMember";
				
	}
	
	
	@GetMapping("/myExpClass")
	public ModelAndView myExpclass(HttpServletRequest request, String memberId) throws Exception {

		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/myPage/myExpClass");
		mv.addObject("expClassDTO", expClassService.getMyInfo(memberId));
		
		return mv;	
	}
	@GetMapping("/myVenueRent")
	public ModelAndView myVenueRent(HttpServletRequest request, String memberId) throws Exception {

		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/myPage/myVenueRent");
		mv.addObject("venueRentDTO", venueRentService.getMyInfo(memberId));
		
		return mv;	
	}
	
	
}
