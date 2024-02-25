package com.LinkedList25FEB;

	class LinkedList {
	    Node head;

	    void insertAtBeginning(int newData) {
	        Node temp = new Node(newData);
	        temp.next = head;
	        head = temp;
	    }

	    void printLinkedList() {
	        Node curr = head;
	        while (curr != null) {
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	    }
	}

	public class InsertionAtBeginning {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insertAtBeginning(30);
	        list.insertAtBeginning(20);
	        list.insertAtBeginning(10);
	        list.insertAtBeginning(40);


	        System.out.println("Linked List after insertion at beginning:");
	        list.printLinkedList();
	    }
	}
