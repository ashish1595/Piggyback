package com.incentives.piggyback.sampleApp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incentives.piggyback.sampleApp.models.Offer;
import com.incentives.piggyback.sampleApp.models.OfferEntity;


public interface OfferService {
	
	ResponseEntity createOffer(OfferEntity offer);
	
	double getOfferValue(String code);
	

}
