package com.LinkedList25FEB;

	

	class LinkedList11 {
	    Node head;

	    // Method to reverse the linked list
	    void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next;

	        while (current != null) {
	            // Store the next node
	            next = current.next;
	            // Reverse the pointer of the current node
	            current.next = prev;
	            // Move prev and current one step forward
	            prev = current;
	            current = next;
	        }

	        // Update the head to point to the new first node
	        head = prev;
	    }

	    // Method to add a node to the linked list
	    void add(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Method to print the linked list
	    void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}

	public class ReveseLl_ai {
	    public static void main(String[] args) {
	        LinkedList11 list = new LinkedList11();
	        // Add some elements to the linked list
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);

	        System.out.println("Original linked list:");
	        list.printList();

	        // Reverse the linked list
	        list.reverse();

	        System.out.println("Reversed linked list:");
	        list.printList();
	    }
	}


