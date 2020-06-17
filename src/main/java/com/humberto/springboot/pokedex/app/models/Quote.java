package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private Integer count; // Conteo de pokemones disponibles
	private String next; // Enlace al siguiente
	private String previus; // Enlace al anterior
	private List<Detail> results; // Listado de resultados

	// Constructor
	public Quote() {
	}

	// Getter and Setters
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevius() {
		return previus;
	}

	public void setPrevius(String previus) {
		this.previus = previus;
	}

	public List<Detail> getResults() {
		return results;
	}

	public void setResults(List<Detail> results) {
		this.results = results;
	}

}