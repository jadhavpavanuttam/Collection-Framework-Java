package com.MultiThreading;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        World1 world1 = new World1();
        world.start();
        for (; ; ) {
            //INFINITLY RUN THIS ONE.
            System.out.println("Hello");
        }
    }
}

class World extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}

class World1 implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}