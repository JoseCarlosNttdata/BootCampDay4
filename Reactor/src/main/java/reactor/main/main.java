package reactor.main;

import reactor.core.publisher.Flux;

public class main {

	public static void main(String[] args) {

//		Publisher<String> publisher = new Publisher<String>() {
//			public void subscribe(Subscriber<? super String> subscriber) {
//				subscriber.onNext("Mensaje de texto");
//				subscriber.onComplete();
//			}
//		};
//		
//	    Consumer<String> consumer1 = new Consumer<String>() {
//	        public void accept(String t) {
//	            System.out.println("Consumer 1 recibió: " + t);
//	        }
//	    };
//
//	    Consumer<String> consumer2 = new Consumer<String>() {
//	        public void accept(String t) {
//	            System.out.println("Consumer 2 recibió: " + t);
//	        }
//	    };
//
//	    Flux.from(publisher).subscribe(consumer1);
//	    Flux.from(publisher).subscribe(consumer2);
		
		// Ejemplo 1
		
		Flux<String> menssageSender = Flux.just("","","");
		menssageSender.subscribe(m-> System.out.println("Consumar. Receiverd:"+m),
				e->System.out.println("Consumer. Error: "+ e.getMessage()),
				()->System.out.println("Consumer. Completed"));
		
		
		// Ejemplo 2
		
		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
        messageSender.subscribe(m -> System.out.println("Consumer 1. Received: " + m),
                                e -> System.out.println("Consumer 1. Error: " + e.getMessage()),
                                () -> System.out.println("Consumer 1. Completed"));
        messageSender.subscribe(m -> System.out.println("Consumer 2. Received: " + m),
                e -> System.out.println("Consumer 2. Error: " + e.getMessage()),
                () -> System.out.println("Consumer 2. Completed"));
	}

}
