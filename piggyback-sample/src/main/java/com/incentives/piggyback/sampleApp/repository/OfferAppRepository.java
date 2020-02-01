package com.incentives.piggyback.sampleApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.incentives.piggyback.sampleApp.models.Offer;
import com.incentives.piggyback.sampleApp.models.OfferEntity;

@Repository("OfferAppRepository")
public interface OfferAppRepository extends MongoRepository<OfferEntity, String>{

}