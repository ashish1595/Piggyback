package com.incentives.piggyback.sampleApp.models;

public class Order {
	
		private Long id;
		private String email;
	    private String address;
	    private String pincode;
	    
	    
	    public Order() {
	    	
	    }
	    
	    
	    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
		

}
