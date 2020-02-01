package com.incentives.piggyback.sampleApp.models;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="offersFromPartner")
public class OfferEntity {
	
	@Id
	private Long offerId;
	private String orderId;
	private String partnerId;
	private String partnerName;
	private String partnerAppUrl;
	private String partnerWebHookAddress;
	private String offerCode;
	private Location orderLocation;
	private String orderType;
	private Long initiatorUserId;
	private Integer maxOptimizations;
	private String offerStatus;
	private String offerDescription;
	private Date createdDate;
	private Date lastModifiedDate;
	private Date expiryDate;
	private Integer optimizationRadius;
	
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
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
	public String getPartnerAppUrl() {
		return partnerAppUrl;
	}
	public void setPartnerAppUrl(String partnerAppUrl) {
		this.partnerAppUrl = partnerAppUrl;
	}
	public String getPartnerWebHookAddress() {
		return partnerWebHookAddress;
	}
	public void setPartnerWebHookAddress(String partnerWebHookAddress) {
		this.partnerWebHookAddress = partnerWebHookAddress;
	}
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public Location getOrderLocation() {
		return orderLocation;
	}
	public void setOrderLocation(Location orderLocation) {
		this.orderLocation = orderLocation;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Long getInitiatorUserId() {
		return initiatorUserId;
	}
	public void setInitiatorUserId(Long initiatorUserId) {
		this.initiatorUserId = initiatorUserId;
	}
	public Integer getMaxOptimizations() {
		return maxOptimizations;
	}
	public void setMaxOptimizations(Integer maxOptimizations) {
		this.maxOptimizations = maxOptimizations;
	}
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	public String getOfferDescription() {
		return offerDescription;
	}
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
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
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getOptimizationRadius() {
		return optimizationRadius;
	}
	public void setOptimizationRadius(Integer optimizationRadius) {
		this.optimizationRadius = optimizationRadius;
	}

}
