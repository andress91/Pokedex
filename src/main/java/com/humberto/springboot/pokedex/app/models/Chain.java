package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chain {

	private List<Chain> evolves_to;
	private Detail species;

	// Constructor
	public Chain() {
	}

	// Getters and Setters
	public List<Chain> getEvolves_to() {
		return evolves_to;
	}

	public void setEvolves_to(List<Chain> evolves_to) {
		this.evolves_to = evolves_to;
	}

	public Detail getSpecies() {
		return species;
	}

	public void setSpecies(Detail species) {
		this.species = species;
	}

}
