package com.thinkpert.sec02;

import com.thinkpert.sec01.subscriber.SubscriberImpl;
import reactor.core.publisher.Mono;

public class Lec02MonoJust { // created a publisher with just the method of Mono

    public static void main(String[] args) {

        var mono = Mono.just("Eria");
        var subscriber = new SubscriberImpl(); // instantiating subscriber
        mono.subscribe(subscriber); // subscribing to publisher
        subscriber.getSubscription().request(10); // subscriber requesting data from a publisher
    }
}
