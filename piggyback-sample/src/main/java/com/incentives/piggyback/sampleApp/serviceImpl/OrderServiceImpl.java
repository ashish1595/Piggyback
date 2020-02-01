package com.incentives.piggyback.sampleApp.serviceImpl;

import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.incentives.piggyback.sampleApp.adapter.PartnerRequestAdapter;
import com.incentives.piggyback.sampleApp.models.Order;
import com.incentives.piggyback.sampleApp.models.PartnerEntity;
import com.incentives.piggyback.sampleApp.models.PartnerOrder;
import com.incentives.piggyback.sampleApp.models.PartnerResponse;
import com.incentives.piggyback.sampleApp.repository.OrderRepository;
import com.incentives.piggyback.sampleApp.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderrepository;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private PartnerRequestAdapter partneradapter;


	@Override
	public void createOrder(@Valid Order order) {
		PartnerOrder partnerRequest = partneradapter.setToPartnerOrde(order);
		orderrepository.save(partnerRequest);
		sendOrderToPartner(partnerRequest);
		
	}
	
	private void sendOrderToPartner(PartnerOrder partnerRequest) {
		
		String url = env.getProperty("partner.api.createorder");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		HttpEntity<?> entity = new HttpEntity<>(partnerRequest, headers);
		ResponseEntity<PartnerEntity> response =
				restTemplate.exchange(builder.toUriString(), HttpMethod.POST,
						entity, PartnerEntity.class);

		System.out.println("Sent order to partner order service with response code" + response.getStatusCode());
	
	}
	

}
