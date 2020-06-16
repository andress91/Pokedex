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
		model.addAttribute("pokemon", servicio.general(id));
		model.addAttribute("descripcion", servicio.getDescription(id));
		model.addAttribute("evolucion1", servicio.evolutionChain(id));
		model.addAttribute("evolucion2", servicio.evolutionChain2(id));
		model.addAttribute("evolucion3", servicio.evolutionChain3(id));
		return "detail";
	}
}
