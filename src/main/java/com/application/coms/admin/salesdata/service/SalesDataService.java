package com.application.coms.admin.salesdata.service;

import java.util.List;
import java.util.Map;

public interface SalesDataService {

	public List<Map<String,Object>> getSalesData_thisMonth() throws Exception;
	public List<Map<String,Object>> getSalesData_thisYear() throws Exception;
	public List<Map<String,Object>> getSalesData_yearly() throws Exception;
	public List<Map<String,Object>> getSalesData_memberAnalysis_thisYear() throws Exception;
	public List<Map<String,Object>> getSalesData_memberAnalysisYearly() throws Exception;
}
