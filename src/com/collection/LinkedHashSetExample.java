package com.collection;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store unique elements while preserving insertion order
        LinkedHashSet<String> fruitsSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Cherry");
        fruitsSet.add("Banana"); // Adding a duplicate element

        // Display the elements of the LinkedHashSet
        System.out.println("Fruits in the LinkedHashSet:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }

        // Check if a specific element exists in the LinkedHashSet
        String searchFruit = "Cherry";
        if (fruitsSet.contains(searchFruit)) {
            System.out.println(searchFruit + " is in the LinkedHashSet.");
        } else {
            System.out.println(searchFruit + " is not in the LinkedHashSet.");
        }

        // Remove an element from the LinkedHashSet
        String removedFruit = "Banana";
        boolean isRemoved = fruitsSet.remove(removedFruit);
        if (isRemoved) {
            System.out.println(removedFruit + " has been removed from the LinkedHashSet.");
        } else {
            System.out.println(removedFruit + " was not found in the LinkedHashSet.");
        }
    }
}