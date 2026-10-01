package com.collection;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Attempting to add a duplicate element (it won't be added)
        fruits.add("Apple");

        // Iterating through the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}