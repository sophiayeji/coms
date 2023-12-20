package com.application.coms.admin.gymmember.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class GymMemberDTO {

	private String name;
	private String memberId;
	private String firstRegDt;
	private String address;
	private String hp;
	private String age;
	private String memo;
	private Date logDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberId() {
		return String.valueOf(memberId);
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFirstRegDt() {
		return firstRegDt;
	}
	public void setFirstRegDt(String firstRegDt) {
		this.firstRegDt = firstRegDt;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	@Override
	public String toString() {
		return "GymMemberDTO [name=" + name + ", memberId=" + memberId + ", firstRegDt=" + firstRegDt + ", address="
				+ address + ", hp=" + hp + ", age=" + age + ", memo=" + memo + ", logDate=" + logDate + "]";
	}

	
}
