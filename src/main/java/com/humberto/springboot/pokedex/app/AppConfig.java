package com.humberto.springboot.pokedex.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean // Para realizar la consulta a la API
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
