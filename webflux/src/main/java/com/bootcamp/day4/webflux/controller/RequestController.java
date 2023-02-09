package com.bootcamp.day4.webflux.controller;

import java.time.Duration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class RequestController {
	
	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<Integer> numbers() {
		
//		return Flux.interval(Duration.ofSeconds(1))
//				.map(i -> (int) (i+1))
//				.take(30);
		return Flux.range(1,30).delayElements(Duration.ofSeconds(1));
	}
	
	@GetMapping(path = "/numbers-with-subscribers", produces = "text/event-stream")
	public Flux<Integer> numbersWithSubscribers() {
		Flux<Integer> flux = Flux.range(1,30).delayElements(Duration.ofSeconds(1));
		
		//Lo normal es hacerlo con un thread.sleep pero por hacerlo rapido, le petí un delay de 3 segundos
		flux.delayElements(Duration.ofSeconds(3)).subscribe(n -> new com.bootcamp.day4.webflux.model.Subscriber().print(n));
		flux.subscribe(n -> System.out.println("Subscriber 2: "+n));
		return null;
	}

}
