package com.incentives.piggyback.sampleApp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incentives.piggyback.sampleApp.models.OfferEntity;
import com.incentives.piggyback.sampleApp.repository.OfferAppRepository;
import com.incentives.piggyback.sampleApp.services.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
	
	@Autowired
	private OfferAppRepository offerAppRepository;

	@Override
	public ResponseEntity createOffer(OfferEntity offer) {
		return ResponseEntity.ok(offerAppRepository.save(offer));
	}

	@Override
	public double getOfferValue(String code) {
	
		if(offerAppRepository.findAll().size()!=0) {
				return 10;
		}
		return 0;
	}

}
