package com.humberto.springboot.pokedex.app.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.humberto.springboot.pokedex.app.models.Chain;
import com.humberto.springboot.pokedex.app.models.Description;
import com.humberto.springboot.pokedex.app.models.Evolution;
import com.humberto.springboot.pokedex.app.models.Pokemon;

@Component
public class Detalle implements IDetalle {

	@Autowired
	private RestTemplate restTemplate;

	public Pokemon general(Integer id) {
		String url = "https://pokeapi.co/api/v2/pokemon/" + id + "/";
		Pokemon wanted = restTemplate.getForObject(url, Pokemon.class);
		return wanted;
	}

	public Description getDescription(Integer id) {
		String url = "https://pokeapi.co/api/v2/pokemon-species/" + id + "/";
		Description details = restTemplate.getForObject(url, Description.class);
		return details;
	}

	public List<Pokemon> evolutionChain(Integer id) {
		List<Pokemon> list = new ArrayList<Pokemon>();
		String url = "https://pokeapi.co/api/v2/pokemon-species/" + id + "/";
		Description details = restTemplate.getForObject(url, Description.class);
		String url2 = details.getEvolution_chain().getUrl();
		Evolution chain = restTemplate.getForObject(url2, Evolution.class);
		Chain evo = chain.getChain();
		String name = evo.getSpecies().getName();
		String urlQuery = "https://pokeapi.co/api/v2/pokemon/" + name + "/";
		Pokemon wanted = restTemplate.getForObject(urlQuery, Pokemon.class);
		list.add(wanted);
		return list;

	}

	public List<Pokemon> evolutionChain2(Integer id) {
		List<Pokemon> list = new ArrayList<Pokemon>();
		String url = "https://pokeapi.co/api/v2/pokemon-species/" + id + "/";
		Description details = restTemplate.getForObject(url, Description.class);
		String url2 = details.getEvolution_chain().getUrl();
		Evolution chain = restTemplate.getForObject(url2, Evolution.class);
		List<String> listName = new ArrayList<String>();
		List<Chain> chain1 = chain.getChain().getEvolves_to();
		for (Chain data : chain1) {
			listName.add(data.getSpecies().getName());
		}
		for (String name : listName) {
			String urlQuery = "https://pokeapi.co/api/v2/pokemon/" + name + "/";
			Pokemon wanted = restTemplate.getForObject(urlQuery, Pokemon.class);
			list.add(wanted);
		}
		return list;
	}

	public List<Pokemon> evolutionChain3(Integer id) {
		List<Pokemon> list = new ArrayList<Pokemon>();
		String url = "https://pokeapi.co/api/v2/pokemon-species/" + id + "/";
		Description details = restTemplate.getForObject(url, Description.class);
		String url2 = details.getEvolution_chain().getUrl();
		Evolution chain = restTemplate.getForObject(url2, Evolution.class);
		List<String> listName = new ArrayList<String>();
		List<Chain> chain1 = chain.getChain().getEvolves_to();
		List<Chain> chain2 = new ArrayList<Chain>();
		for (Chain data : chain1) {
			if (!data.getEvolves_to().isEmpty()) {
				for (Chain data2 : data.getEvolves_to()) {
					chain2.add(data2);
				}
			}
		}
		for (Chain data : chain2) {
			listName.add(data.getSpecies().getName());
		}
		for (String name : listName) {
			String urlQuery = "https://pokeapi.co/api/v2/pokemon/" + name + "/";
			Pokemon wanted = restTemplate.getForObject(urlQuery, Pokemon.class);
			list.add(wanted);
		}
		return list;
	}
}
