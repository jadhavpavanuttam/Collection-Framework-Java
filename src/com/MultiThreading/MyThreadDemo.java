package com.MultiThreading;

class Counter {
    private int count = 0; // shared resource

//  whenever we have to make synchronized method that time counting going to 2000
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class MyThreadDemo extends Thread {
    private Counter counter;

    public MyThreadDemo(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadDemo t1 = new MyThreadDemo(counter);
        MyThreadDemo t2 = new MyThreadDemo(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000
    }
}