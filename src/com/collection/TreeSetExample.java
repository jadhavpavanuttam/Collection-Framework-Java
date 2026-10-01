package com.collection;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store integers in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Display the elements in sorted order
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Remove an element from the TreeSet
        int removedNumber = 2;
        boolean isRemoved = numbers.remove(removedNumber);
        if (isRemoved) {
            System.out.println(removedNumber + " has been removed.");
        } else {
            System.out.println(removedNumber + " was not found.");
        }
    }
}