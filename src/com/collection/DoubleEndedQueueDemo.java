package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueueDemo {
    public static void main(String[] args) {
        Deque<String> printerQueue = new ArrayDeque<>();

        // Add print jobs to the rear of the queue
        printerQueue.offer("Document1.pdf"); // Rear
        printerQueue.offer("Document2.pdf");
        printerQueue.offer("Document3.pdf");

        // Print jobs are processed from the front of the queue
        String currentJob = printerQueue.poll(); // Front
        System.out.println("Printing: " + currentJob);

        // Add an urgent print job to the front of the queue
        printerQueue.offerFirst("UrgentDocument.pdf"); // Front

        // Print remaining jobs
        while (!printerQueue.isEmpty()) {
            currentJob = printerQueue.poll();
            System.out.println("Printing: " + currentJob);
        }
    }
}