package com.collection;


import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Updated Stack: " + stack);

        // Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        System.out.println("Stack after Peek: " + stack);
    }
}