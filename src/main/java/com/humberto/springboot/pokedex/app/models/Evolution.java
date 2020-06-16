package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Evolution {

	private Integer id;
	private Boolean baby_trigger_item;
	private Chain chain;

	// Constructor
	public Evolution() {
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getBaby_trigger_item() {
		return baby_trigger_item;
	}

	public void setBaby_trigger_item(Boolean baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

}
