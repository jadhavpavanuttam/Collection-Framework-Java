package com.pavan.streamAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class DeadLock {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//        Future<List<String>> submit = executor.submit(() -> Arrays
//                .asList("pavan", "jagruti", "mrunal", "amol", "Jayesh", "jayshri", "manoj", "kajal", "naina"));
//        submit
//                .get()
//                .stream()
//                .filter(x -> x.startsWith("p") || x.startsWith("j"))
//                .toList()
//                .stream()
//                .iterator()
//                .forEachRemaining(System.out::println);
        System.out.println("Start : " + LocalTime.now());
        ReentrantLock lock = new ReentrantLock(true);
        Object obj = new Object();
        Object obj1 = new Object();
        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println("a");  //2
                        lock.lock();
                        synchronized (obj) {
                            System.out.println("b"); //6
                            synchronized (obj1) {
                                System.out.println("Hash code for object 1 is : " + obj.hashCode());//7
                            }
                        }
                    } finally {
                        lock.unlock();
                        System.out.println("c");   //8
                    }
                });
        Thread thread1 = new Thread(
                () -> {
                    try {
                        System.out.println("d");  //1
                        lock.lock();
                        synchronized (obj1) {
                            System.out.println("e");  //3
                            synchronized (obj) {
                                System.out.println("Hash code for object 2 is : " + obj1.hashCode()); //4
                            }
                        }

                    } finally {
                        lock.unlock();
                        System.out.println("f");  //5
                    }
                }
        );
        thread1.start();
        thread.start();

        Thread.sleep(Duration.ofMillis(100));

        System.out.println("End  : " + LocalTime.now());
    }
}
