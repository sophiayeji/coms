package com.application.coms.webmember.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.webmember.dto.WebMemberDTO;
import com.application.coms.webmember.service.WebMemberService;




@Controller
@RequestMapping("/webmember")
public class WebMemberController {

	@Autowired
	private WebMemberService webMemberService;
	
	@GetMapping("/register")
	public ModelAndView register() throws Exception {
		return new ModelAndView("/webmember/register");
	}
	
	@PostMapping("/register")
	public String register(HttpServletRequest request, WebMemberDTO webMemberDTO) throws Exception {
		
		webMemberService.addWebMember(webMemberDTO);
		return "/webmember/notifyJoin";			
	}
	
	
	@PostMapping("/overlappedId")
	@ResponseBody
	public String overlappedId(@RequestParam("memberId") String memberId) throws Exception{
		return webMemberService.checkDuplicatedId(memberId);
	}
	
	@GetMapping("/loginWebMember")
	public ModelAndView login() throws Exception {
		return new ModelAndView("/webmember/loginWebMember");
	}
	
	
	@PostMapping("/loginWebMember")
	public String loginWebMember(WebMemberDTO webMemberDTO , HttpServletRequest request) throws Exception {
			
		
		if (webMemberService.loginWebMember(webMemberDTO) !=null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("memberId", webMemberDTO.getMemberId());
			session.setAttribute("role", "client");
			
		
			return "redirect:/";
				
			
		}
		return null; 
		
			
	}
			
	@GetMapping("/logoutWebMember")
	public ResponseEntity<Object> logout(HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate(); 
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		String jsScript = "<script>";
			   jsScript += " alert('로그아웃 되었습니다.');";
			   jsScript += "location.href='" + request.getContextPath() + "/';";
			   jsScript += " </script>";
		
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
	
	} 
}
	

