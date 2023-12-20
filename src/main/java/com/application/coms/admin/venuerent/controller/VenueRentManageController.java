package com.application.coms.admin.venuerent.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.expclass.dto.ExpClassDTO;
import com.application.coms.venuerent.dto.VenueRentDTO;
import com.application.coms.venuerent.service.VenueRentService;



@Controller
@RequestMapping("/admin/venueRent")
public class VenueRentManageController {
	
	@Autowired
	private VenueRentService venueRentService;
	
	
	@GetMapping("/approve")
	public ModelAndView approve(HttpServletRequest request)throws Exception {
		
		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/venueRent/approve");
		
		int onePageViewCnt = 10;
		
		if (request.getParameter("onePageViewCnt") != null) {
			onePageViewCnt = Integer.parseInt(request.getParameter("onePageViewCnt"));
		}
		
		String temp = request.getParameter("currentPageNumber");
		if (temp == null) {
			temp = "1";
		}
		int currentPageNumber = Integer.parseInt(temp);
		
		int allOrderCnt = venueRentService.getAllOrderCnt();
		
		int allPageCnt = allOrderCnt / onePageViewCnt + 1;
		
		if (allOrderCnt % onePageViewCnt == 0) allPageCnt--;
		
		int startPage = (currentPageNumber - 1)  / 10  * 10 + 1;
		if (startPage == 0) {
			startPage = 1;
		}
		
		int endPage = startPage + 9;
		
		if (endPage > allPageCnt) endPage = allPageCnt;
		
		
		int startBoardIdx = (currentPageNumber - 1) * onePageViewCnt;
		
		mv.addObject("startPage"         , startPage);
		mv.addObject("endPage"           , endPage);
		mv.addObject("allOrderCnt"   	 , allOrderCnt);
		mv.addObject("allPageCnt"   	 , allPageCnt);
		mv.addObject("currentPageNumber" , currentPageNumber);
		mv.addObject("startBoardIdx"     , startBoardIdx);
		
				
		mv.addObject("venueRentList", venueRentService.getvenueRentList());

		return mv;
				
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(@RequestParam("uuid") String uuid) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/venueRent/detail");
		mv.addObject("venueRentDTO" , venueRentService.getOrderDetail(uuid));
		return mv;
		
	}
	@PostMapping("/detail") 
	public String addApprovalYn(@ModelAttribute VenueRentDTO venueRentDTO, HttpServletRequest request)throws Exception {
			
		
		venueRentService.addApprovalYn(venueRentDTO);
		
		return "/adminNotify";	
	} 	
	
	
	@GetMapping("/paymentHistory")
	public ModelAndView paymentHistoryList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/venueRent/paymentHistory");
		mv.addObject("paymentHistoryList", venueRentService.getPaymentHistory());
		
		return mv;	
	}	
	

}
