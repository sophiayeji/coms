package com.application.coms.board.wod.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.coms.board.dto.BoardWodDTO;
import com.application.coms.board.wod.dao.BoardWodDAO;
import com.application.coms.webmember.dao.WebMemberDAO;
import com.application.coms.webmember.dto.WebMemberDTO;


@Service
public class BoardWodServiceImpl implements BoardWodService {
	
	@Autowired				
	private BoardWodDAO boardWodDAO;
	
	@Autowired				
	private WebMemberDAO webMemberDAO;
	
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
	public BoardWodDTO getBoardDetail(String uuid, boolean isIncreaseReadCnt) throws Exception {
		if(isIncreaseReadCnt) {
			boardWodDAO.updateReadCnt(uuid);
		}
		return boardWodDAO.selectOneBoard(uuid);
	}


	@Override
	public void removeBoard(BoardWodDTO boardWodDTO, WebMemberDTO webMemberDTO) throws Exception {
		
		WebMemberDTO verifyNum = webMemberDAO.selectOneVerifyNum(webMemberDTO.getVerifyNum());
		
		boardWodDAO.deleteBoard(boardWodDTO);
	}

	@Override
	public void modifyBoard(BoardWodDTO boardWodDTO, WebMemberDTO webMemberDTO) throws Exception {
		boardWodDAO.updateBoard(boardWodDTO);
		
	}

	


}
