package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DetailDescription {

	private String flavor_text; // Descripicion
	private Detail language; // Idioma
	private Detail version; // Juego

	// Constructor
	public DetailDescription() {
	}

	// Getters and Setters
	public Detail getLanguage() {
		return language;
	}

	public String getFlavor_text() {
		return flavor_text;
	}

	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}

	public void setLanguage(Detail language) {
		this.language = language;
	}

	public Detail getVersion() {
		return version;
	}

	public void setVersion(Detail version) {
		this.version = version;
	}

}
