package com.thinkpert.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    private static final Logger log = LoggerFactory.getLogger(Lec03MonoSubscribe.class);

    public static void main(String[] args) {
        var mono = Mono
                        .just(1)
                        .map(i -> i / 0); // create a publisher with just the method of Mono
        mono.subscribe(
                i -> log.info("Received {}", i),
                err -> log.error("Error", err),
                () -> log.info("Stream completed"),
                subscription -> subscription.request(10)
        ); // subscribing to a publisher and requesting data
    }
}
