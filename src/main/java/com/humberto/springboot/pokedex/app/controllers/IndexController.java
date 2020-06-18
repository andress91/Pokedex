package com.humberto.springboot.pokedex.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humberto.springboot.pokedex.app.models.services.IServicio;

@Controller
public class IndexController {

	@Autowired
	private IServicio servicio;

	@GetMapping({"/", "" ,"/index" })
	public String index(@RequestParam(defaultValue = "https://pokeapi.co/api/v2/pokemon/") String url, Model model) {
		model.addAttribute("titulo", "Pokedex");
		model.addAttribute("respuesta", servicio.leer(url));
		model.addAttribute("arreglo", servicio.arregloPokemon(url));
		return "index";
	}


}
