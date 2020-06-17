package com.humberto.springboot.pokedex.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.humberto.springboot.pokedex.app.models.services.IDetalle;

@Controller
@RequestMapping("/pokemon")
public class DetalleController {

	@Autowired
	private IDetalle servicio;

	@GetMapping({ "/", "" })
	public String mostrar(@RequestParam Integer id, Model model) {
		model.addAttribute("pokemon", servicio.general(id)); // Datos generales del Pokemon
		model.addAttribute("descripcion", servicio.getDescription(id)); // Descripciones generales del Pokemon
		model.addAttribute("evolucion1", servicio.evolutionChain(id)); // Primera etapa de evolucion
		model.addAttribute("evolucion2", servicio.evolutionChain2(id)); // Segunda etapa de evolucion
		model.addAttribute("evolucion3", servicio.evolutionChain3(id)); // Tercera etapa de evolucion
		return "detail";
	}
}
