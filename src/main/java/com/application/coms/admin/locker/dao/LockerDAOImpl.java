package com.application.coms.admin.locker.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.admin.locker.dto.LockerDTO;

@Repository
public class LockerDAOImpl implements LockerDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertLocker(LockerDTO lockerDTO) throws Exception {
		sqlSession.insert("Locker.insertLocker", lockerDTO);
			
		}

	@Override
	public List<LockerDTO> selectSearchLocker(Map<String, Object> map) throws Exception {
		return sqlSession.selectList("Locker.SearchLocker",map);
	}
}
