package com.application.coms.webmember.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class WebMemberDTO {
	
	private String memberId;
	private String memberNm;
	private String passwd;
	private int hp;
	private String email;
	private String sex;
	private String privacyYn;
	private Date joinDt;
	private String verifyNum;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPrivacyYn() {
		return privacyYn;
	}
	public void setPrivacyYn(String privacyYn) {
		this.privacyYn = privacyYn;
	}
	public Date getJoinDt() {
		return joinDt;
	}
	public void setJoinDt(Date joinDt) {
		this.joinDt = joinDt;
	}
	public String getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}
	@Override
	public String toString() {
		return "WebMemberDTO [memberId=" + memberId + ", memberNm=" + memberNm + ", passwd=" + passwd + ", hp=" + hp
				+ ", email=" + email + ", sex=" + sex + ", privacyYn=" + privacyYn + ", joinDt=" + joinDt
				+ ", verifyNum=" + verifyNum + "]";
	}
	
	
	
}