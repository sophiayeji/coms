package com.application.coms.board.wod.dao;

import java.util.List;
import java.util.Map;

import com.application.coms.board.dto.BoardWodDTO;

public interface BoardWodDAO {

	public List<BoardWodDTO> selectListBoard(Map<String, Object> searchMap)throws Exception;
	public int selectOneAllBoardCnt(Map<String, String> searchCntMap)throws Exception;
	public void insertBoard(BoardWodDTO boardWodDTO)throws Exception;
	public void updateReadCnt(String uuid)throws Exception;
	public BoardWodDTO selectOneBoard(String uuid)throws Exception;
	public void updateBoard(BoardWodDTO boardWodDTO)throws Exception;
	public void deleteBoard(BoardWodDTO boardWodDTO)throws Exception;



}
