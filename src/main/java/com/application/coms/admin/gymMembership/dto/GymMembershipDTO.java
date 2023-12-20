package com.application.coms.admin.gymMembership.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class GymMembershipDTO {

	private String name;
	private String memberId;
	private String uuid;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date   memStartDt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date   memEndDt;
	private String memMon;
	private String paymentAmt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date   paymentDt;
	private String paymentMeth;
	private Date logDate;
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
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getMemStartDt() {
		return memStartDt;
	}
	public void setMemStartDt(Date memStartDt) {
		this.memStartDt = memStartDt;
	}
	public Date getMemEndDt() {
		return memEndDt;
	}
	public void setMemEndDt(Date memEndDt) {
		this.memEndDt = memEndDt;
	}
	public String getMemMon() {
		return memMon;
	}
	public void setMemMon(String memMon) {
		this.memMon = memMon;
	}
	public String getPaymentAmt() {
		return paymentAmt;
	}
	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public Date getPaymentDt() {
		return paymentDt;
	}
	public void setPaymentDt(Date paymentDt) {
		this.paymentDt = paymentDt;
	}
	public String getPaymentMeth() {
		return paymentMeth;
	}
	public void setPaymentMeth(String paymentMeth) {
		this.paymentMeth = paymentMeth;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "GymMembershipDTO [name=" + name + ", memberId=" + memberId + ", uuid=" + uuid + ", memStartDt="
				+ memStartDt + ", memEndDt=" + memEndDt + ", memMon=" + memMon + ", paymentAmt=" + paymentAmt
				+ ", paymentDt=" + paymentDt + ", paymentMeth=" + paymentMeth + ", logDate=" + logDate + ", category="
				+ category + "]";
	}	
}
