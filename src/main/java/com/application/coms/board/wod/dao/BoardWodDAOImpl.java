package com.application.coms.board.wod.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.Get;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.coms.board.dto.BoardWodDTO;

@Repository
public class BoardWodDAOImpl implements BoardWodDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BoardWodDTO> selectListBoard(Map<String, Object> searchMap) throws Exception {
		return sqlSession.selectList("boardWod.selectListBoard", searchMap);
	}

	@Override
	public int selectOneAllBoardCnt(Map<String, String> searchCntMap) throws Exception {
		return sqlSession.selectOne("boardWod.selectOneAllBoardCnt" , searchCntMap);
	
	}

	@Override
	public void insertBoard(BoardWodDTO boardWodDTO) throws Exception {
		sqlSession.insert("boardWod.insertBoard" , boardWodDTO);
		
	}

	@Override
	public void updateReadCnt(String uuid) throws Exception {
		sqlSession.update("boardWod.updateReadCnt",uuid);		
	}

	@Override
	public BoardWodDTO selectOneBoard(String uuid) throws Exception {	
		return sqlSession.selectOne("boardWod.selectOneBoard" , uuid);
	}

	@Override
	public void updateBoard(BoardWodDTO boardWodDTO) throws Exception {
		sqlSession.update("boardWod.updateBoard", boardWodDTO);
	}

	@Override
	public void deleteBoard(BoardWodDTO boardWodDTO) throws Exception {
		sqlSession.delete("boardWod.deleteBoard", boardWodDTO);
	}	
	
}
