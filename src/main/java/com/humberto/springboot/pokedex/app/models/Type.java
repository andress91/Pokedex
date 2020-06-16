package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Type {

	private Detail type; // Listado de tipos
	private Integer slot; // Espacio

	// Constructor
	public Type() {
	}

	// Getters and Setters
	public Detail getType() {
		return type;
	}

	public void setType(Detail type) {
		this.type = type;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}
}
