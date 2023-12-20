package com.application.coms.admin.contact.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.contact.dto.ContactDTO;

@Repository
public class AdminContactDAOImpl implements AdminContactDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ContactDTO> selectListContact() throws Exception {
		return sqlSession.selectList("contact.selectListContact");
	}

	@Override
	public ContactDTO selectOneContact(String uuid) throws Exception {
		return sqlSession.selectOne("contact.selectOneContact", uuid);
	}

	@Override
	public void deleteContact(String[] deleteContactUuidList) throws Exception {
		sqlSession.delete("contact.deleteContact" , deleteContactUuidList);		
	}
}
