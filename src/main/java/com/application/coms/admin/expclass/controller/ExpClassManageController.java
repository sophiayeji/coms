package com.application.coms.admin.expclass.controller;

import java.util.UUID;

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
import com.application.coms.expclass.service.ExpClassService;

@Controller
@RequestMapping("/admin/expclass")
public class ExpClassManageController {
	
	@Autowired
	private ExpClassService expClassService;
	
	@GetMapping("/approve")
	public ModelAndView approve(HttpServletRequest request)throws Exception {
		
		HttpSession session = request.getSession();
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/expclass/approve");
		
		int onePageViewCnt = 10;
		
		if (request.getParameter("onePageViewCnt") != null) {
			onePageViewCnt = Integer.parseInt(request.getParameter("onePageViewCnt"));
		}
		
		String temp = request.getParameter("currentPageNumber");
		if (temp == null) {
			temp = "1";
		}
		int currentPageNumber = Integer.parseInt(temp);
		
		int allOrderCnt = expClassService.getAllOrderCnt();
		
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
		
				
		mv.addObject("expClassList", expClassService.getExpClassList());
	
		return mv;
				
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(@RequestParam("uuid") String uuid) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/expclass/detail");
		mv.addObject("expClassDTO" , expClassService.getOrderDetail(uuid));
		return mv;
		
	}
	@PostMapping("/detail") 
	public String addApprovalYn(@ModelAttribute ExpClassDTO expClassDTO, HttpServletRequest request)throws Exception {
			
		
		expClassService.addApprovalYn(expClassDTO);
		
		return "/adminNotify";	
	} 	
	
	
	@GetMapping("/paymentHistory")
	public ModelAndView paymentHistoryList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/expclass/paymentHistory");
		mv.addObject("paymentHistoryList", expClassService.getPaymentHistory());
		
		return mv;	
	}	
	
}
