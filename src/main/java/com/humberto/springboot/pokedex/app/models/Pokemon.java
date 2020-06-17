package com.humberto.springboot.pokedex.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Pokemon {
	private Integer id; // Numero del pokemon
	private String name; // Nombre del pokemon
	private Integer base_experience; // Experiencia base
	private Float height; // Altura
	private Float weight; // Peso
	private List<Ability> abilities; // Lista de habilidades
	private Sprite sprites; // Imagenes
	private List<Type> types; // Tipos del pokemon

	// Constructor
	public Pokemon() {

	}

	// Get and Set methods
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public Sprite getSprites() {
		return sprites;
	}

	public void setSprites(Sprite sprites) {
		this.sprites = sprites;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	/*
	 * forms location_area_encounters moves species stats
	 * 
	 */
}
