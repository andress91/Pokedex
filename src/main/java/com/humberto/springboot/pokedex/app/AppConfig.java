package com.humberto.springboot.pokedex.app;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean // Para realizar la consulta a la API
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
