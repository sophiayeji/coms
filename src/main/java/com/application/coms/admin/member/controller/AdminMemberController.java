package com.application.coms.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.webmember.dto.WebMemberDTO;
import com.application.coms.webmember.service.WebMemberService;

@Controller
@RequestMapping("/admin")
public class AdminMemberController {

	@Autowired
	private WebMemberService webMemberService;
	
	@GetMapping("/boardWodAdminLogin")  
	public ModelAndView loginBoardWod() throws Exception {
		return new ModelAndView("/admin/boardWodAdminLogin");
	}
	
	@PostMapping("/boardWodAdminLogin")
	public String loginBoardWod(WebMemberDTO webMemberDTO , HttpServletRequest request) throws Exception {
				
		if (webMemberService.loginBoardWod(webMemberDTO) != null) {

			HttpSession session = request.getSession();
			session.setAttribute("memberId", webMemberDTO.getMemberId());	
			session.setAttribute("passwd", webMemberDTO.getPasswd());
			
			return "/boardWod/addBoard";
			
			
		}		
	
		return "/adminNotify";
	}
	
	@GetMapping("/adminLogin")
	public ModelAndView adminLogin() throws Exception {
		return new ModelAndView("/admin/adminLogin");
	}	
	
	@PostMapping("/adminLogin")
	public String adminLogin(WebMemberDTO webMemberDTO , HttpServletRequest request) throws Exception {
				
		
		if (webMemberService.adminLogin(webMemberDTO) !=null) { 	
			
			HttpSession session = request.getSession();		
			session.setAttribute("memberId", webMemberDTO.getMemberId());	
			session.setAttribute("passwd", webMemberDTO.getPasswd());
			session.setAttribute("role" , "admin");
			session.setMaxInactiveInterval(60 * 30);
			
			
			return "/adminNotify";
			
		}
	 return "error";
	}
	
}
