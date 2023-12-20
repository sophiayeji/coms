package com.application.coms.venuerent.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class VenueRentDTO {

	private String uuid;
	private String memberId;
	private String regNm;
	private int hp;
	private String rentDt;
	private String rentT;
	private String rentTime;
	private int numUse;
	private String purposeUse;
	private Date RegDt;
	private String approvalYn;
	private Date   approvalDt;
	private String category;
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
	public String getRegNm() {
		return regNm;
	}
	public void setRegNm(String regNm) {
		this.regNm = regNm;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getRentDt() {
		return rentDt;
	}
	public void setRentDt(String rentDt) {
		this.rentDt = rentDt;
	}
	public String getRentT() {
		return rentT;
	}
	public void setRentT(String rentT) {
		this.rentT = rentT;
	}
	public String getRentTime() {
		return rentTime;
	}
	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}
	public int getNumUse() {
		return numUse;
	}
	public void setNumUse(int numUse) {
		this.numUse = numUse;
	}
	public String getPurposeUse() {
		return purposeUse;
	}
	public void setPurposeUse(String purposeUse) {
		this.purposeUse = purposeUse;
	}
	public Date getRegDt() {
		return RegDt;
	}
	public void setRegDt(Date regDt) {
		RegDt = regDt;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "VenueRentDTO [uuid=" + uuid + ", memberId=" + memberId + ", regNm=" + regNm + ", hp=" + hp + ", rentDt="
				+ rentDt + ", rentT=" + rentT + ", rentTime=" + rentTime + ", numUse=" + numUse + ", purposeUse="
				+ purposeUse + ", RegDt=" + RegDt + ", approvalYn=" + approvalYn + ", approvalDt=" + approvalDt
				+ ", category=" + category + "]";
	}	
}
