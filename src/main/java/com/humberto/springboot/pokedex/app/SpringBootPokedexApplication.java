package com.humberto.springboot.pokedex.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.humberto.springboot.pokedex.app.models.Quote;


@SpringBootApplication
public class SpringBootPokedexApplication {

	private static final Logger log = 
			LoggerFactory.getLogger(SpringBootPokedexApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPokedexApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://pokeapi.co/api/v2/pokemon/", Quote.class);
			log.info(quote.toString());
		};
	}
	
}
