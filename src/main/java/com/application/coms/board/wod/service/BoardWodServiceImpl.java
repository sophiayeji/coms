package com.application.coms.board.wod.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.coms.board.dto.BoardWodDTO;
import com.application.coms.board.wod.dao.BoardWodDAO;


@Service
public class BoardWodServiceImpl implements BoardWodService {
	
	@Autowired				
	private BoardWodDAO boardWodDAO;
	
	@Override
	public List<BoardWodDTO> getBoardList(Map<String, Object> searchMap) throws Exception {
		return boardWodDAO.selectListBoard(searchMap);
	}

	@Override
	public int getAllBoardCnt(Map<String, String> searchCntMap) throws Exception {
		return boardWodDAO.selectOneAllBoardCnt(searchCntMap);
	}

	@Override
	public void addBoard(BoardWodDTO boardWodDTO) throws Exception {
		boardWodDAO.insertBoard(boardWodDTO);	
	}

	@Override
	public BoardWodDTO getBoardDetail(String subject, boolean isIncreaseReadCnt) throws Exception {
		if(isIncreaseReadCnt) {
			boardWodDAO.updateReadCnt(subject);
		}
		return boardWodDAO.selectOneBoard(subject);
	}

	@Override
	public void modifyBoard(BoardWodDTO boardWodDTO) throws Exception {
		boardWodDAO.updateBoard(boardWodDTO);
	}

	@Override
	public void removeBoard(BoardWodDTO boardWodDTO) throws Exception {
		boardWodDAO.deleteBoard(boardWodDTO);
	}

	


}
