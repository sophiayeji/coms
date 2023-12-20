package com.application.coms.admin.salesdata.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesDataDAOImpl implements SalesDataDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Map<String, Object>> selectThisMonthSalesData() throws Exception {
		return sqlSession.selectList("salesData.selectListSalesDataThisMonth");
	}

	@Override
	public List<Map<String, Object>> selectThisYearSalesData() throws Exception {
		return sqlSession.selectList("salesData.selectListSalesDataThisYear");
	}

	@Override
	public List<Map<String, Object>> selectListSalesDataYearly() throws Exception {
		return sqlSession.selectList("salesData.selectListSalesDataYearly");
	}

	@Override
	public List<Map<String, Object>> selectSalesDataMemberAnalysis_thisyear() throws Exception {
		return sqlSession.selectList("salesData.selectSalesDataMemberAnalysis_thisyear_Monthly");
	}

	@Override
	public List<Map<String, Object>> selectSalesDataMemberAnalysisYearly() throws Exception {
		return sqlSession.selectList("salesData.selectSalesDataMemberAnalysis_Yearly");
	}
}
