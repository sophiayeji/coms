package com.application.coms.expclass.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.expclass.dto.ExpClassDTO;
import com.application.coms.expclass.service.ExpClassService;
import com.application.coms.webmember.service.WebMemberService;



@Controller
@RequestMapping("/expClass")
public class ExpClassController {

	@Autowired
	private ExpClassService expClassService;
	
	@Autowired 
	private WebMemberService webMemberService;
	
	@GetMapping("/reserveExpClass")
	public ModelAndView reserveExpClass(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/expClass/reserveExpClass");
		
		HttpSession session = request.getSession();
		mv.addObject("memberInfo", webMemberService.getMyInfo((String)session.getAttribute("memberId")));

		return mv;
		
	}

	@PostMapping("/reserveExpClass")
	public String reserveExpClass(HttpServletRequest request, ExpClassDTO expClassDTO) throws Exception {

		HttpSession session = request.getSession();
		
		String uuid=UUID.randomUUID().toString();
		expClassDTO.setUuid(uuid);
		
		expClassService.addExpClass(expClassDTO);
		session.setAttribute("uuidExp", expClassDTO.getUuid());
		
		
		return "/expClass/notifyReserve";			
	}
		
}
