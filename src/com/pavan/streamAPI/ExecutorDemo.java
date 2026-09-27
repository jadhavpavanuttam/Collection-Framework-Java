package com.pavan.streamAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
//Runnable
        for (int i = 0; i < 50; i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println("Task :" + task + " is Completed. By : " + Thread.currentThread().getName());
            });
        }
        if (executor.isShutdown()) {
            System.out.println("Yes Bhai..!");
        } else {

            System.out.println("May be...?");
        }
        for (int i = 0; i < 30; i++) {
            int x = i;
            executor.execute(() -> {
                System.out.println("Task : " + x + " is Done..by  " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
