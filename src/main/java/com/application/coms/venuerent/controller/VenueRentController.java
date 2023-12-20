package com.application.coms.venuerent.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.application.coms.venuerent.dto.VenueRentDTO;
import com.application.coms.venuerent.service.VenueRentService;
import com.application.coms.webmember.service.WebMemberService;

@Controller
@RequestMapping("/venueRental")
public class VenueRentController {

	@Autowired
	private VenueRentService venueRentService;
	
	@Autowired 
	private WebMemberService webMemberService;
	
	@GetMapping("/reserveVenue")
	public ModelAndView reserveVenue(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/venueRental/reserveVenue");
		
		HttpSession session = request.getSession();
		mv.addObject("memberInfo",  webMemberService.getMyInfo((String)session.getAttribute("memberId")));
	
		return mv;
	}
	
	@PostMapping("/reserveVenue")
	public String reserveVenue(HttpServletRequest request, VenueRentDTO venueRentDTO) throws Exception {
		
		HttpSession session = request.getSession();
		
		String uuid=UUID.randomUUID().toString();
		venueRentDTO.setUuid(uuid);
		
		venueRentService.addRentVenue(venueRentDTO);
		session.setAttribute("uuidVenue", venueRentDTO.getUuid());
		
		return "/venueRental/notifyReserve";			
	}
			
}
