package com.incentives.piggyback.sampleApp.models;

import java.util.Date;
import java.util.List;

public class PartnerEntity {

	private String partnerId;
	private String partnerName;
	private String partnerDescription;
	private String partnerWebHookAddress;
	private String partnerOfficeAddress;
	private String partnerMobile;
	private List<String> userIds;
	private Date createdDate;
	private Date lastModifiedDate;
	private Integer isActive;

	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getPartnerDescription() {
		return partnerDescription;
	}
	public void setPartnerDescription(String partnerDescription) {
		this.partnerDescription = partnerDescription;
	}
	public String getPartnerWebHookAddress() {
		return partnerWebHookAddress;
	}
	public void setPartnerWebHookAddress(String partnerWebHookAddress) {
		this.partnerWebHookAddress = partnerWebHookAddress;
	}
	public String getPartnerOfficeAddress() {
		return partnerOfficeAddress;
	}
	public void setPartnerOfficeAddress(String partnerOfficeAddress) {
		this.partnerOfficeAddress = partnerOfficeAddress;
	}
	public String getPartnerMobile() {
		return partnerMobile;
	}
	public void setPartnerMobile(String partnerMobile) {
		this.partnerMobile = partnerMobile;
	}
	public List<String> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
}
