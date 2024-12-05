package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ValueStorage {

    private static AtomicInteger value = new AtomicInteger();

//    private static int value;

    public static void incrementValue() {
        value.incrementAndGet();

//        value = value + 1;
    }

    public static int getValue() {

        return value.intValue();
//        return value;
    }

}
