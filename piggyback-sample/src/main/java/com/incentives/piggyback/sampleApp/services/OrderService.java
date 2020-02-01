package com.incentives.piggyback.sampleApp.services;

import javax.validation.Valid;

import com.incentives.piggyback.sampleApp.models.Order;

public interface OrderService {

	void createOrder(@Valid Order order);

}
