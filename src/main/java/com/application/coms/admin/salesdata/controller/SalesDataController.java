package com.application.coms.admin.salesdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.salesdata.service.SalesDataService;

@Controller
@RequestMapping("/admin/salesData")
public class SalesDataController {
	
	@Autowired
	private SalesDataService salesDataService;
	
	@GetMapping("/SalesData_thisMonth")
	public ModelAndView SalesDataThisMonth() throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/salesData/SalesData_thisMonth");
		mv.addObject("SalesDataThisMonth", salesDataService.getSalesData_thisMonth());
	
		return mv;
	}
	
	@GetMapping("/SalesData_thisYear")
	public ModelAndView SalesDataThisYear() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/salesData/SalesData_thisYear");
		mv.addObject("SalesDataThisYear", salesDataService.getSalesData_thisYear());
		
		return mv;
	}
	
	@GetMapping("/SalesData_yearly")
	public ModelAndView SalesDataYearly() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/salesData/SalesData_yearly");
		mv.addObject("SalesDataYearly", salesDataService.getSalesData_yearly());
		
		return mv;
	}
	
	@GetMapping("/MemberAnalysis_thisYear")
	public ModelAndView MemberAnalysisThisYear() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/salesData/MemberAnalysis_thisYear");
		mv.addObject("MemberAnalysis_thisyear_Monthly", salesDataService.getSalesData_memberAnalysis_thisYear());
		
		return mv;
	}
	
	@GetMapping("/MemberAnalysisYearly")
	public ModelAndView MemberAnalysisYearly() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/salesData/MemberAnalysisYearly");
		mv.addObject("MemberAnalysis_Yearly", salesDataService.getSalesData_memberAnalysisYearly());
		
		return mv;
	}
}