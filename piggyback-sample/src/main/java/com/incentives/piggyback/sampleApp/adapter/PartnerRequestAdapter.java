package com.incentives.piggyback.sampleApp.adapter;

import org.springframework.stereotype.Component;

import com.incentives.piggyback.sampleApp.constants.Constant;
import com.incentives.piggyback.sampleApp.models.Location;
import com.incentives.piggyback.sampleApp.models.Order;
import com.incentives.piggyback.sampleApp.models.PartnerOrder;

@Component
public class PartnerRequestAdapter {
	
	public PartnerOrder setToPartnerOrde(Order order) {
		 PartnerOrder partnerOrder = new PartnerOrder();
		 Location location = new Location();
		 	partnerOrder.setPartnerId(Constant.partnerId);
	        partnerOrder.setInitiatorUserId(Constant.initiatorUserId);
	        partnerOrder.setMaxOptimizations(3);
	        partnerOrder.setOptimizationDuration(3600);
	        partnerOrder.setOptimizationRadius(1000);
//	        location.setLongitude(103.774095);
//	        location.setLatitude(1.293014);
	        location.setLongitude(103.7689494);
	        location.setLatitude(1.312175);
	        partnerOrder.setOrderLocation(location);
	        partnerOrder.setOrderStatus(Constant.ordeStatus);
	        partnerOrder.setOrderType(Constant.orderType);
	        partnerOrder.setPartnerDisplayName(Constant.partnerDisplayName);
	        partnerOrder.setPartnerRedirectUrl(Constant.partnerRedirectUrl);
		return partnerOrder;
		
	}

}
