package com.application.coms.admin.gymmemberpic.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class GymMemberPicDTO {

	public String uuid;
	public String memberId;
	public String fileName;
	public Date logDate;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	@Override
	public String toString() {
		return "GymMemberPicDTO [uuid=" + uuid + ", memberId=" + memberId + ", fileName=" + fileName + ", logDate="
				+ logDate + "]";
	}
	
	
}
