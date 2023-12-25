package com.application.coms.board.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BoardWodDTO {

	private String uuid;
	private String subject;
	private String writer;
	private String content;
	private long readCnt;
	private Date enrollDt;
	private Date modifyDt;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(long readCnt) {
		this.readCnt = readCnt;
	}
	public Date getEnrollDt() {
		return enrollDt;
	}
	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}
	public Date getModifyDt() {
		return modifyDt;
	}
	public void setModifyDt(Date modifyDt) {
		this.modifyDt = modifyDt;
	}
	@Override
	public String toString() {
		return "BoardWodDTO [uuid=" + uuid + ", subject=" + subject + ", writer=" + writer + ", content=" + content
				+ ", readCnt=" + readCnt + ", enrollDt=" + enrollDt + ", modifyDt=" + modifyDt + "]";
	}
		
}