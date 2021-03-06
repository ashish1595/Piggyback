package com.incentives.piggyback.location.utils;

public interface Constant {
	Integer SUCCESS_STATUS = 200;
	Integer FAILURE_STATUS = 101;

	String LOCATION_PUBLISHER_TOPIC = "location.publisher.topic";
	String KAFKA_BOOTSTRAP_ADDRESS = "kafka.bootstrap.address";

	String LOCATION_SOURCE_ID = "1";

	String LOCATION_CREATED_EVENT = "locationCreated";
	String LOCATION_UPDATED_EVENT = "locationUpdated";


}