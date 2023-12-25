package com.application.coms.board.wod.service;

import java.util.List;
import java.util.Map;

import com.application.coms.board.dto.BoardWodDTO;
import com.application.coms.webmember.dto.WebMemberDTO;

public interface BoardWodService {

	public List<BoardWodDTO> getBoardList(Map<String, Object> searchMap)throws Exception;
	public int getAllBoardCnt(Map<String, String> searchCntMap)throws Exception;
	public void addBoard(BoardWodDTO boardWodDTO)throws Exception;
	public BoardWodDTO getBoardDetail(String uuid, boolean isIncreaseReadCnt)throws Exception;
	public void modifyBoard(BoardWodDTO boardWodDTO, WebMemberDTO webMemberDTO)throws Exception;
	public void removeBoard(BoardWodDTO boardWodDTO, WebMemberDTO webMemberDTO)throws Exception;
}
