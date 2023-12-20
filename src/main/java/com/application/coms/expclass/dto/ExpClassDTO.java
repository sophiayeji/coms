package com.application.coms.expclass.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ExpClassDTO {

	private String uuid;
	private String memberId;
	private int	   hp;
	private String name;
	private String classDt;
	private String classTime;
	private int	   expNum;
	private int	   crsftExpNum;
	private Date   regDt;
	private String category;
	private String approvalYn;
	private Date   approvalDt;
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
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassDt() {
		return classDt;
	}
	public void setClassDt(String classDt) {
		this.classDt = classDt;
	}
	public String getClassTime() {
		return classTime;
	}
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	public int getExpNum() {
		return expNum;
	}
	public void setExpNum(int expNum) {
		this.expNum = expNum;
	}
	public int getCrsftExpNum() {
		return crsftExpNum;
	}
	public void setCrsftExpNum(int crsftExpNum) {
		this.crsftExpNum = crsftExpNum;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getApprovalYn() {
		return approvalYn;
	}
	public void setApprovalYn(String approvalYn) {
		this.approvalYn = approvalYn;
	}
	public Date getApprovalDt() {
		return approvalDt;
	}
	public void setApprovalDt(Date approvalDt) {
		this.approvalDt = approvalDt;
	}
	@Override
	public String toString() {
		return "ExpClassDTO [uuid=" + uuid + ", memberId=" + memberId + ", hp=" + hp + ", name=" + name + ", classDt="
				+ classDt + ", classTime=" + classTime + ", expNum=" + expNum + ", crsftExpNum=" + crsftExpNum
				+ ", regDt=" + regDt + ", category=" + category + ", approvalYn=" + approvalYn + ", approvalDt="
				+ approvalDt + "]";
	}	
}