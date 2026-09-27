package com.pavan.streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(5);  //take something but not gives
        System.out.printf("%d", 23);
        List<Integer> list1 = Arrays.asList(1, 2, 4, 5, 6);
        Consumer<List<Integer>> listConsumer = x -> {
            for (int i : list1)
                System.out.println(" " + i);
        };

    }
}

