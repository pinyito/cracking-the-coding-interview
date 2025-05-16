package com.thinkpert.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

/*
    If we do not have a terminal operator, then stream operators will not execute.
    By default, nature, a stream is lazy and will only execute when a terminal operation is provided.
 */
public class Lec01LazyStream {

    private static final Logger log = LoggerFactory.getLogger(Lec01LazyStream.class);

    public static void main(String[] args) {
        Stream.of(1)
                .peek(i -> log.info("Received {}", i))
                .toList();
    }
}
