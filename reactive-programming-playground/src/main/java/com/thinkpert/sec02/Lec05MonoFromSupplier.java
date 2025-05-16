package com.thinkpert.sec02;

import com.thinkpert.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.List;

public class Lec05MonoFromSupplier {

    private static final Logger log = LoggerFactory.getLogger(Lec03MonoSubscribe.class);

    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        // Obvious approach for Mono from a supplier
//        Mono.just(sum(list));// breaking it up
//                .subscribe(Util.subscriber()); // we see that Mono.just is executing, not safe for compute intensive calls
        // Safe approach for Mono from a supplier :: creates a delayed publisher
        Mono.fromSupplier(() -> sum(list))
                .subscribe(Util.subscriber());
    }

    private static int sum(List<Integer> list){
        log.info("finding the sum of {}", list);
        return list.stream().mapToInt(i -> i).sum();
    }
}
