package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Description {

	private DetailDescription[] flavor_text_entries;
	private Url evolution_chain;

	// Constructor
	public Description() {
	}

	// Getters and Setters
	public DetailDescription[] getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(DetailDescription[] flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public Url getEvolution_chain() {
		return evolution_chain;
	}

	public void setEvolution_chain(Url evolution_chain) {
		this.evolution_chain = evolution_chain;
	}

}
