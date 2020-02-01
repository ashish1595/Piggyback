package com.incentives.piggyback.sampleApp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "sampleAppOrder")
public class PartnerOrder {
	
	@Id
    private String orderId;
	
    private String partnerId;
	
	private String orderType;
	 
    private String orderStatus;
	
    private int optimizationDuration;

	private Location orderlocation;

	private Integer  maxOptimizations;
	 
    private Integer optimizationRadius;
	
    private String initiatorUserId;
	
	private String partnerDisplayName;
	
	private String partnerRedirectUrl;
	
    
    public PartnerOrder(){
    	
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

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOptimizationDuration() {
		return optimizationDuration;
	}

	public void setOptimizationDuration(int optimizationDuration) {
		this.optimizationDuration = optimizationDuration;
	}

	public Integer getMaxOptimizations() {
		return maxOptimizations;
	}

	public void setMaxOptimizations(Integer maxOptimizations) {
		this.maxOptimizations = maxOptimizations;
	}

	public Integer getOptimizationRadius() {
		return optimizationRadius;
	}

	public void setOptimizationRadius(Integer optimizationRadius) {
		this.optimizationRadius = optimizationRadius;
	}

	public String getInitiatorUserId() {
		return initiatorUserId;
	}

	public void setInitiatorUserId(String initiatorUserId) {
		this.initiatorUserId = initiatorUserId;
	}

	public String getPartnerDisplayName() {
		return partnerDisplayName;
	}

	public void setPartnerDisplayName(String partnerDisplayName) {
		this.partnerDisplayName = partnerDisplayName;
	}

	public String getPartnerRedirectUrl() {
		return partnerRedirectUrl;
	}

	public void setPartnerRedirectUrl(String partnerRedirectUrl) {
		this.partnerRedirectUrl = partnerRedirectUrl;
	}  
	
	public Location getOrderLocation() {
		return orderlocation;
	}

	public void setOrderLocation(Location location) {
		this.orderlocation = location;
	}
	
}
