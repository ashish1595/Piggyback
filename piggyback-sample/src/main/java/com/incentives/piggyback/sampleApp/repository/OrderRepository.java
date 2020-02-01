package com.incentives.piggyback.sampleApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.incentives.piggyback.sampleApp.models.PartnerOrder;

@Repository
public interface OrderRepository extends MongoRepository<PartnerOrder, String>{

}
