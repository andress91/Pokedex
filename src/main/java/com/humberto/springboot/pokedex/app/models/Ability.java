package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Ability {

	private Detail ability; // Listado de habilidades
	private Boolean is_hidden; // Booleano que indica si es una habilidad oculta
	private Integer slot; // Espacio

	// Constructor
	public Ability() {

	}

	// Getters and Setters
	public Detail getAbility() {
		return ability;
	}

	public void setAbility(Detail ability) {
		this.ability = ability;
	}

	public Boolean getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(Boolean is_hidden) {
		this.is_hidden = is_hidden;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

}
