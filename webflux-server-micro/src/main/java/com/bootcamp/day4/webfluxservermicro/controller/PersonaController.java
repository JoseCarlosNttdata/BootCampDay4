package com.bootcamp.day4.webfluxservermicro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.day4.webfluxservermicro.model.Persona;

import reactor.core.publisher.Flux;

@RestController
public class PersonaController {
	@GetMapping("/person-list-1")
	public Flux<Persona> personaList1(){
		Flux<Persona> flux=Flux.just(
				new Persona("Jose","Perejon",31),
				new Persona("Pepe","Perez",23),
				new Persona("Pepe","Perez",23),
				new Persona("Juan","Castellon",15),
				new Persona("Pedro","Escobar",32),
				new Persona("Antonio","Gutierrez",27)
				);
		return flux;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Persona> personaList2(){
		Flux<Persona> flux=Flux.just(
				new Persona("Jose","Perejon",31),
				new Persona("Pepe","Perez",23),
				new Persona("Pepe","Perez",23),
				new Persona("Juan","Castellon",15),
				new Persona("Pedro","Escobar",32),
				new Persona("Antonio","Gutierrez",27)
				);
		return flux;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Persona> personaList3(){
		Flux<Persona> flux=Flux.just(
				new Persona("Jose","Perejon",31),
				new Persona("Pepe","Perez",23),
				new Persona("Pepe","Perez",23),
				new Persona("Juan","Castellon",15),
				new Persona("Pedro","Escobar",32),
				new Persona("Antonio","Gutierrez",27)
				);
		return flux;
	}
	
	
	@GetMapping("/person-list-4")
	public Flux<Persona> personaList4(){
		Flux<Persona> flux=Flux.just(
				new Persona("Jose","Perejon",31),
				new Persona("Pepe","Perez",23),
				new Persona("Pepe","Perez",23),
				new Persona("Juan","Castellon",15),
				new Persona("Pedro","Escobar",32),
				new Persona("Antonio","Gutierrez",27)
				);
		return flux;
	}
	
	
}
