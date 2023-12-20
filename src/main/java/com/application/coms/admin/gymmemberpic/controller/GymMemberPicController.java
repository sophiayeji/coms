package com.application.coms.admin.gymmemberpic.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.application.coms.admin.gymmember.dto.GymMemberDTO;
import com.application.coms.admin.gymmemberpic.dto.GymMemberPicDTO;
import com.application.coms.admin.gymmemberpic.service.GymMemberPicService;

@Controller
@RequestMapping("/admin/gymmemberpic")
public class GymMemberPicController {
	@Autowired
	private GymMemberPicService gymMemberPicService;
	
	
	private final String MEMBER_IMAGE_REPO_PATH = "C:\\coms_file_repo\\";	
	//private final String MEMBER_IMAGE_REPO_PATH = "/var/lib/tomcat9/file_repo/";	
		
	@GetMapping("/picUpdate")
	public ModelAndView addMemberpic(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();  			
		mv.setViewName("/admin/gymmemberpic/picUpdate");
	
		
		return mv;
	}
	
	
	@PostMapping("/picUpdate")
	public ResponseEntity<Object> gymMemberPicUpdate(MultipartHttpServletRequest multipartRequest, GymMemberDTO gymMemberDTO)throws Exception {
		
		multipartRequest.setCharacterEncoding("utf-8");
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");

		GymMemberPicDTO gymMemberPicDTO = new GymMemberPicDTO();
		gymMemberPicDTO.setMemberId(multipartRequest.getParameter("memberId"));
		
		String uuid=UUID.randomUUID().toString();
		gymMemberPicDTO.setUuid(uuid);
		
		Iterator<String> file = multipartRequest.getFileNames();
		if (file.hasNext()) {
			
			MultipartFile uploadFile = multipartRequest.getFile(file.next()); 	
			
			if(!uploadFile.getOriginalFilename().isEmpty()) {
				String uploadFileName = UUID.randomUUID() + "_" + uploadFile.getOriginalFilename();
				File f = new File(MEMBER_IMAGE_REPO_PATH + uploadFileName);	
				uploadFile.transferTo(f); 
				gymMemberPicDTO.setFileName(uploadFileName);
			}
		
		}
		
		gymMemberPicService.addGymMemberPic(gymMemberPicDTO, gymMemberDTO);
		
		String jsScript = "<script>";
		   jsScript += "alert('파일이 업로드 되었습니다')";
		   jsScript +=" location.href='adminNotify';";
		   jsScript +="</script>";
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.add("Content-Type", "text/html; charset=utf-8");
	    	    		
		return new ResponseEntity<Object>(jsScript ,responseHeaders, HttpStatus.OK);
			
	}
}
