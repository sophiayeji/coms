package com.application.coms.admin.salesdata.dao;

import java.util.List;
import java.util.Map;

public interface SalesDataDAO {

	public List<Map<String, Object>> selectThisMonthSalesData()throws Exception;
	public List<Map<String, Object>> selectThisYearSalesData()throws Exception;
	public List<Map<String, Object>> selectListSalesDataYearly()throws Exception;
	public List<Map<String, Object>> selectSalesDataMemberAnalysis_thisyear()throws Exception;
	public List<Map<String, Object>> selectSalesDataMemberAnalysisYearly()throws Exception;

}
