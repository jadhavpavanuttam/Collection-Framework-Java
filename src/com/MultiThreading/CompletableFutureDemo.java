package com.MultiThreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 2";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 3";
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        allFutures.thenRun(() -> {
            // All futures completed
            String result1 = future1.join();
            String result2 = future2.join();
            String result3 = future3.join();
            System.out.println(result1 + ", " + result2 + ", " + result3);
        });

//How to handle Exception in java
//this is advance version of Future<?>;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int result = 10 / 0; // Causes an ArithmeticException
            return result;
        });
        future.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });


//        more than one threads using CompletableFuture
//        allFutures.exceptionally(ex -> {
//            System.out.println("Exception occurred: " + ex.getMessage());
//            return null; // Default value to return if there's an exception
//        }).thenRun(() -> {
//            // All futures completed
//            int result1 = Integer.parseInt(future1.join());
//            int result2 = Integer.parseInt(future2.join());
//            int result3 = Integer.parseInt(future3.join());
//            System.out.println(result1 + ", " + result2 + ", " + result3);
//        });
    }
}
