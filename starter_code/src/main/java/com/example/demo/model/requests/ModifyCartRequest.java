package com.example.demo.model.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModifyCartRequest {
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private long itemId;
	
	@JsonProperty
	private int quantity;

	public void setUsername(String username) {
		this.username = username;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUsername() {
		return username;
	}
	public long getItemId() {
		return itemId;
	}
	public int getQuantity() {
		return quantity;
	}

}
