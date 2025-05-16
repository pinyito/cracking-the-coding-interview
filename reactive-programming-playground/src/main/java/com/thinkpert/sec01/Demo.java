package com.thinkpert.sec01;

import com.thinkpert.sec01.publisher.PublisherImpl;
import com.thinkpert.sec01.subscriber.SubscriberImpl;

/*
    In this Demo, we shall be validating the following reactive programming rules:
    1. Publisher does not produce data unless a subscriber requests for it.
    2. Publisher will produce only <= subscriber requested items. Publisher can also produce 0 items.
    3. Subscribers can cancel the subscription. Producer should stop at that moment as the subscriber is no longer
       interested in consuming data.
    4. Producer can send the error signa to indicate something is wrong.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        demo1(); // rule 1. validated
        demo2(); // rule 2. validated
    }

    private static void demo1(){
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
    }

    private static void demo2() throws InterruptedException {
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        subscriber.getSubscription().request(3);
        Thread.sleep(2000);
        subscriber.getSubscription().request(3);
        Thread.sleep(2000);
        subscriber.getSubscription().request(3);
        Thread.sleep(2000);
        subscriber.getSubscription().request(3);
    }
}
