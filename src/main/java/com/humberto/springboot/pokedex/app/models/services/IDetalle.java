package com.humberto.springboot.pokedex.app.models.services;

import java.util.List;

import com.humberto.springboot.pokedex.app.models.Description;
import com.humberto.springboot.pokedex.app.models.Pokemon;

public interface IDetalle {

	public Pokemon general(Integer id);
	public Description getDescription(Integer id);
	public List<Pokemon> evolutionChain(Integer id);
	public List<Pokemon> evolutionChain2(Integer id);
	public List<Pokemon> evolutionChain3(Integer id);
}
