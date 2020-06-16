package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private Integer count;
	private String next;
	private String previus;
	private List<Detail> results;

	public Quote() {
	}

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