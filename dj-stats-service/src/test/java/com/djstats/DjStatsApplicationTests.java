package com.djstats;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Slf4j
class DjStatsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void monoSubscriber() {
		String name = "Jacek";
		Mono<String> mono = Mono.just(name).log();
		mono.subscribe(System.out::println);
		StepVerifier.create(mono).expectNext(name).verifyComplete();
	}

	@Test
	void monoSubscriberWithParams() {
		String name = "Jacek";
		Mono<String> mono = Mono.just(name).log().map(String::toUpperCase);
		mono.subscribe(System.out::println,
				e -> log.error("Error: ", e),
				() -> log.info("Completed"),
				 Subscription::cancel);
		StepVerifier.create(mono).expectNext(name.toUpperCase()).verifyComplete();
	}

}
