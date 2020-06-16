package com.humberto.springboot.pokedex.app.models.services;

import java.util.List;

import com.humberto.springboot.pokedex.app.models.Pokemon;
import com.humberto.springboot.pokedex.app.models.Quote;

public interface IServicio {

	public Quote leer(String url);

	public List<Pokemon> arregloPokemon(String url);
}
