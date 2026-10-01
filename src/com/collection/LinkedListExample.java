package com.collection;


import java.util.Scanner;

// Define a Node class to represent elements in the linked list
class Node {
    int data;    // Data stored in the node
    Node next;   // Reference to the next node

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is set to null
    }
}

public class LinkedListExample {
    public static Node insert(Node head, int data) {
        // Function to insert a new node at the end of the linked list
        if (head == null) {
            // If the linked list is empty, create a new node and set it as the head
            return new Node(data);
        }
        Node current = head;
        while (current.next != null) {
            // Traverse the list to find the last node
            current = current.next;
        }
        // Create a new node with the given data and add it to the end of the list
        current.next = new Node(data);
        return head;
    }

    public static Node delete(Node head, int data) {
        // Function to delete a node with the specified data from the linked list
        if (head == null) {
            // If the linked list is empty, nothing to delete
            return null;
        }
        if (head.data == data) {
            // If the head node contains the data, update the head to the next node
            return head.next;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            // Traverse the list to find the node to be deleted
            current = current.next;
        }
        if (current.next != null) {
            // Update the next reference to skip the node to be deleted
            current.next = current.next.next;
        }
        return head;
    }

    public static void display(Node head) {
        // Function to display the elements of the linked list
        Node current = head;
        while (current != null) {
            // Traverse the list and print each element
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null; // Initialize the linked list as empty

        while (true) {
            // Display menu options
            System.out.println("Linked List Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Insert operation
                    System.out.print("Enter element to insert: ");
                    int insertData = scanner.nextInt();
                    head = insert(head, insertData);
                    break;
                case 2:
                    // Delete operation
                    System.out.print("Enter element to delete: ");
                    int deleteData = scanner.nextInt();
                    head = delete(head, deleteData);
                    break;
                case 3:
                    // Display operation
                    display(head);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
