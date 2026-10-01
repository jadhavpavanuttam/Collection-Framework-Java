package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentList = new ArrayList<>();

        // Add student names to the ArrayList
        studentList.add("Aman");
        studentList.add("Virat");
        studentList.add("Rohit");
        studentList.add("Jasprit");

        // Create an iterator to go through the student names
        Iterator<String> iterator = studentList.iterator();

        // Use a while loop to iterate through the ArrayList
        while (iterator.hasNext()) {
            // Get the next student name from the iterator
            String studentName = iterator.next();

            // Check if the student's name is "Jasprit"
            if (studentName.equals("Jasprit")) {
                // If it is "Jasprit," remove this student from the list
                iterator.remove();
                System.out.println("Removed student: " + studentName);
            } else {
                // Print the current student name to the console
                System.out.println("Student Name: " + studentName);
            }
        }

        // Print the updated list after removing "Jasprit"
        System.out.println("Updated Student List: " + studentList);
    }
}

