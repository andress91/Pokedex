package com.humberto.springboot.pokedex.app.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.humberto.springboot.pokedex.app.models.Detail;
import com.humberto.springboot.pokedex.app.models.Pokemon;
import com.humberto.springboot.pokedex.app.models.Quote;

@Component
public class Lectura implements IServicio {

	@Autowired
	private RestTemplate restTemplate;

	public Quote leer(String url) {
		Quote quote = restTemplate.getForObject(url, Quote.class);
		return quote;
	}

	public List<Pokemon> arregloPokemon(String url) {
		Quote collection = restTemplate.getForObject(url, Quote.class);
		List<Pokemon> list = new ArrayList<Pokemon>();
		for (Detail data : collection.getResults()) {
			Pokemon loop = restTemplate.getForObject(data.getUrl(), Pokemon.class);
			list.add(loop);
		}

		return list;

	}

}
