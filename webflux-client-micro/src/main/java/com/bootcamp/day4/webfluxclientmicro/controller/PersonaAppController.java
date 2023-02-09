package com.bootcamp.day4.webfluxclientmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.day4.webfluxservermicro.model.Persona;
import com.bootcamp.day4.webfluxservermicro.services.PersonaServicio;

import reactor.core.publisher.Flux;

@Controller
public class PersonaAppController {
	@Autowired
	PersonaServicio personaServicio;
	
	@GetMapping("/person-list")
	public String personaList(final Model model){
		final Flux<Persona> personaList = personaServicio.allPersonas();
		model.addAttribute("personalist",personaList);
		return "personaList";
	}

}
