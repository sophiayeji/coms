package com.application.coms.admin.salesdata.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.coms.admin.salesdata.dao.SalesDataDAO;

@Service
public class SalesDataServiceImpl implements SalesDataService {

	@Autowired
	private SalesDataDAO salesDataDAO;

	@Override
	public List<Map<String, Object>> getSalesData_thisMonth() throws Exception {
		return salesDataDAO.selectThisMonthSalesData();
	}

	@Override
	public List<Map<String, Object>> getSalesData_thisYear() throws Exception {
		return salesDataDAO.selectThisYearSalesData();
	}

	@Override
	public List<Map<String, Object>> getSalesData_yearly() throws Exception {
		return salesDataDAO.selectListSalesDataYearly();
	}

	@Override
	public List<Map<String, Object>> getSalesData_memberAnalysis_thisYear() throws Exception {
		return salesDataDAO.selectSalesDataMemberAnalysis_thisyear();
	}

	@Override
	public List<Map<String, Object>> getSalesData_memberAnalysisYearly() throws Exception {
		return salesDataDAO.selectSalesDataMemberAnalysisYearly();
	} 
}
