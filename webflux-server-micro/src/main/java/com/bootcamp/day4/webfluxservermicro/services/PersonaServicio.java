package com.bootcamp.day4.webfluxservermicro.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bootcamp.day4.webfluxservermicro.model.Persona;

import reactor.core.publisher.Flux;

public class PersonaServicio {
	
	WebClient client = WebClient.create("http://localhost:8080/person-list-1");
	WebClient client2 = WebClient.create("http://localhost:8080/person-list-2");
	WebClient client3 = WebClient.create("http://localhost:8080/person-list-3");
	WebClient client4 = WebClient.create("http://localhost:8080/person-list-4");

	public Flux<Persona> allPersonas() {
		 Flux<Persona> flux = client.get().uri("/person-list").retrieve().bodyToFlux(Persona.class);
		 
		 Flux<Persona> allPersons = Flux.merge(
				 client.get().retrieve().bodyToFlux(Persona.class),
				 client2.get().retrieve().bodyToFlux(Persona.class),
				 client3.get().retrieve().bodyToFlux(Persona.class),
				 client4.get().retrieve().bodyToFlux(Persona.class)
				 );
		 return allPersons;
	}

}
