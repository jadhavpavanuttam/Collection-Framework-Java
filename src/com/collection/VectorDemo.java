package com.collection;


import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();

        // Add elements to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access elements by index
        int secondNumber = numbers.get(1); // Accessing the second element (20)

        // Update an element
        numbers.set(0, 15); // Replacing the first element (10) with 15

        // Remove an element
        numbers.remove(2); // Removing the third element (30)

        // Check if an element is in the Vector
        boolean containsTwenty = numbers.contains(20); // true

        // Print the size of the Vector
        int size = numbers.size(); // Size is now 2

        // Print the elements of the Vector
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}