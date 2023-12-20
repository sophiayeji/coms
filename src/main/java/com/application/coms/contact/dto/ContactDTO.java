package com.application.coms.contact.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ContactDTO {

	private String uuid;
	private String name;
	private String hp;
	private String subject;
	private String content;
	private Date regDt;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	@Override
	public String toString() {
		return "ContactDTO [uuid=" + uuid + ", name=" + name + ", hp=" + hp + ", subject=" + subject + ", content="
				+ content + ", regDt=" + regDt + "]";
	}
		
}
