package com.incentives.piggyback.sampleApp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="offersFromPartner")
public class Offer {
	
	@Id
    private String id;
    private String offer;
    
    public Offer() {
    	
    }
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}

}
