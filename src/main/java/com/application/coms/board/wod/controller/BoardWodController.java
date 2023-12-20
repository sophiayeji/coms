package com.application.coms.board.wod.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.board.dto.BoardWodDTO;
import com.application.coms.board.wod.service.BoardWodService;

@Controller
@RequestMapping("/boardWod/")
public class BoardWodController {

	@Autowired								
	private BoardWodService boardWodService;		
	
	@GetMapping("/addBoard")
	public ModelAndView addBoard() throws Exception{
		return new ModelAndView("/boardWod/addBoard");
	}
	
	
	@PostMapping("/addBoard")
	public ResponseEntity<Object> addBoard(BoardWodDTO boardWodDTO , HttpServletRequest request) throws Exception{
		
		
		boardWodService.addBoard(boardWodDTO);

		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>("boardList" , responseHeaders , HttpStatus.OK);
		
	}
	
	@GetMapping("/boardList")
	public ModelAndView boardList(HttpServletRequest request) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/boardList");
		
		String searchKeyword = request.getParameter("searchKeyword");
		if (searchKeyword == null) searchKeyword = "total";
		
		String searchWord = request.getParameter("searchWord");
		if (searchWord == null) searchWord = "";
		
		
		int onePageViewCnt = 10;
		
		if (request.getParameter("onePageViewCnt") != null) {
			onePageViewCnt = Integer.parseInt(request.getParameter("onePageViewCnt"));
		}
		
		String temp = request.getParameter("currentPageNumber");
		if (temp == null) {
			temp = "1";
		}
		int currentPageNumber = Integer.parseInt(temp);
		
		
		Map<String, String> searchCntMap = new HashMap<String, String>();
		searchCntMap.put("searchKeyword", searchKeyword);
		searchCntMap.put("searchWord", searchWord);
		
		
		int allBoardCnt = boardWodService.getAllBoardCnt(searchCntMap);
		
		int allPageCnt = allBoardCnt / onePageViewCnt + 1;
		
		if (allBoardCnt % onePageViewCnt == 0) allPageCnt--;
		
		int startPage = (currentPageNumber - 1)  / 10  * 10 + 1;
		if (startPage == 0) {
			startPage = 1;
		}
		
		int endPage = startPage + 9;
		
		if (endPage > allPageCnt) endPage = allPageCnt;
		
		
		int startBoardIdx = (currentPageNumber - 1) * onePageViewCnt;
		
		mv.addObject("startPage"         , startPage);
		mv.addObject("endPage"           , endPage);
		mv.addObject("allBoardCnt"   	 , allBoardCnt);
		mv.addObject("allPageCnt"   	 , allPageCnt);
		mv.addObject("onePageViewCnt"    , onePageViewCnt);
		mv.addObject("currentPageNumber" , currentPageNumber);
		mv.addObject("startBoardIdx"     , startBoardIdx);
		mv.addObject("searchKeyword"     , searchKeyword);
		mv.addObject("searchWord"        , searchWord);
		
		
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("onePageViewCnt" , onePageViewCnt);
		searchMap.put("startBoardIdx"  , startBoardIdx);
		searchMap.put("searchKeyword"  , searchKeyword);
		searchMap.put("searchWord"     , searchWord);
		mv.addObject("boardList"      ,  boardWodService.getBoardList(searchMap));		
		
		
		return mv;
	}
	
	@GetMapping("/boardDetail")
	public ModelAndView boardDetail(@RequestParam("subject") String subject) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/boardDetail");
		mv.addObject("boardWodDTO" , boardWodService.getBoardDetail(subject , true));
		
		return mv;
		
	}
	
	@GetMapping("/modifyBoard")
	public ModelAndView modifyBoard(@RequestParam("subject") String subject) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/modifyBoard");
		mv.addObject("boardWodDTO" , boardWodService.getBoardDetail(subject , false));
		
		return mv;
		
	}
		
	@PostMapping("/modifyBoard")
	public ResponseEntity<Object> modifyBoard(BoardWodDTO boardWodDTO , HttpServletRequest request) throws Exception{

		
		boardWodService.modifyBoard(boardWodDTO);
		
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>("boardList" , responseHeaders , HttpStatus.OK);

	
	}
	

	@GetMapping("/removeBoard")
	public ModelAndView removeBoard(@RequestParam("subject") String subject) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/removeBoard");
		mv.addObject("BoardWodDTO" , boardWodService.getBoardDetail(subject , false));
		
		return mv;
		
	}
	
	
	@PostMapping("/removeBoard")
	public ResponseEntity<Object> removeBoard(BoardWodDTO boardWodDTO , HttpServletRequest request) throws Exception{
		
			boardWodService.removeBoard(boardWodDTO);
		
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "text/html; charset=utf-8");
			
			return new ResponseEntity<Object>("boardList" , responseHeaders , HttpStatus.OK);

		}
	
	@GetMapping("/boardListAdmin")
	public ModelAndView boardListAdmin(HttpServletRequest request) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/boardListAdmin");
		
		String searchKeyword = request.getParameter("searchKeyword");
		if (searchKeyword == null) searchKeyword = "total";
		
		String searchWord = request.getParameter("searchWord");
		if (searchWord == null) searchWord = "";
		
		
		int onePageViewCnt = 10;
		
		if (request.getParameter("onePageViewCnt") != null) {
			onePageViewCnt = Integer.parseInt(request.getParameter("onePageViewCnt"));
		}
		
		String temp = request.getParameter("currentPageNumber");
		if (temp == null) {
			temp = "1";
		}
		int currentPageNumber = Integer.parseInt(temp);
		
		
		Map<String, String> searchCntMap = new HashMap<String, String>();
		searchCntMap.put("searchKeyword", searchKeyword);
		searchCntMap.put("searchWord", searchWord);
		
		
		int allBoardCnt = boardWodService.getAllBoardCnt(searchCntMap);
		
		int allPageCnt = allBoardCnt / onePageViewCnt + 1;
		
		if (allBoardCnt % onePageViewCnt == 0) allPageCnt--;
		
		int startPage = (currentPageNumber - 1)  / 10  * 10 + 1;
		if (startPage == 0) {
			startPage = 1;
		}
		
		int endPage = startPage + 9;
		
		if (endPage > allPageCnt) endPage = allPageCnt;
		
		
		int startBoardIdx = (currentPageNumber - 1) * onePageViewCnt;
		
		mv.addObject("startPage"         , startPage);
		mv.addObject("endPage"           , endPage);
		mv.addObject("allBoardCnt"   	 , allBoardCnt);
		mv.addObject("allPageCnt"   	 , allPageCnt);
		mv.addObject("onePageViewCnt"    , onePageViewCnt);
		mv.addObject("currentPageNumber" , currentPageNumber);
		mv.addObject("startBoardIdx"     , startBoardIdx);
		mv.addObject("searchKeyword"     , searchKeyword);
		mv.addObject("searchWord"        , searchWord);
		
		
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("onePageViewCnt" , onePageViewCnt);
		searchMap.put("startBoardIdx"  , startBoardIdx);
		searchMap.put("searchKeyword"  , searchKeyword);
		searchMap.put("searchWord"     , searchWord);
		mv.addObject("boardList"      ,  boardWodService.getBoardList(searchMap));		
		
		
		return mv;
	}
	
	@GetMapping("/boardDetailAdmin")
	public ModelAndView boardDetailAdmin(@RequestParam("subject") String subject) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardWod/boardDetailAdmin");
		mv.addObject("BoardWodDTO" , boardWodService.getBoardDetail(subject , true));
		
		return mv;
		
	}
			
}
