package com.application.coms.admin.locker.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class LockerDTO {

	private String name;			
	private String memberId;
	private int lockerNum;
	private String uuid; 
	private String lockerStartDt;
	private String lockerEndDt;
	private int lockerMon;
	private int paymentAmt;
	private String paymentDt;
	private String paymentMethod;
	private String category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getLockerNum() {
		return lockerNum;
	}
	public void setLockerNum(int lockerNum) {
		this.lockerNum = lockerNum;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getLockerStartDt() {
		return lockerStartDt;
	}
	public void setLockerStartDt(String lockerStartDt) {
		this.lockerStartDt = lockerStartDt;
	}
	public String getLockerEndDt() {
		return lockerEndDt;
	}
	public void setLockerEndDt(String lockerEndDt) {
		this.lockerEndDt = lockerEndDt;
	}
	public int getLockerMon() {
		return lockerMon;
	}
	public void setLockerMon(int lockerMon) {
		this.lockerMon = lockerMon;
	}
	public int getPaymentAmt() {
		return paymentAmt;
	}
	public void setPaymentAmt(int paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public String getPaymentDt() {
		return paymentDt;
	}
	public void setPaymentDt(String paymentDt) {
		this.paymentDt = paymentDt;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "LockerDTO [name=" + name + ", memberId=" + memberId + ", lockerNum=" + lockerNum + ", uuid=" + uuid
				+ ", lockerStartDt=" + lockerStartDt + ", lockerEndDt=" + lockerEndDt + ", lockerMon=" + lockerMon
				+ ", paymentAmt=" + paymentAmt + ", paymentDt=" + paymentDt + ", paymentMethod=" + paymentMethod
				+ ", category=" + category + "]";
	}	
}
