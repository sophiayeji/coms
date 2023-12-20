package com.application.coms.admin.recess.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class RecessDTO {

	public String name;
	public String memberId;
	public String uuid;
	public String recessStartDt;
	public String recessEndDt;
	public String regRestartDt;
	public String regRestartEndDt;
	public Date   logDate;
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
	public String getRecessStartDt() {
		return recessStartDt;
	}
	public void setRecessStartDt(String recessStartDt) {
		this.recessStartDt = recessStartDt;
	}
	public String getRecessEndDt() {
		return recessEndDt;
	}
	public void setRecessEndDt(String recessEndDt) {
		this.recessEndDt = recessEndDt;
	}
	public String getRegRestartDt() {
		return regRestartDt;
	}
	public void setRegRestartDt(String regRestartDt) {
		this.regRestartDt = regRestartDt;
	}
	public String getRegRestartEndDt() {
		return regRestartEndDt;
	}
	public void setRegRestartEndDt(String regRestartEndDt) {
		this.regRestartEndDt = regRestartEndDt;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	@Override
	public String toString() {
		return "RecessDTO [name=" + name + ", memberId=" + memberId + ", uuid=" + uuid + ", recessStartDt="
				+ recessStartDt + ", recessEndDt=" + recessEndDt + ", regRestartDt=" + regRestartDt
				+ ", regRestartEndDt=" + regRestartEndDt + ", logDate=" + logDate + "]";
	}
	

}
