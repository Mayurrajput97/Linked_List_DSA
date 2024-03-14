package com.LinkedList25FEB;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class Logic {
	Node head;
	Node tail;

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	void addFirst(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}
	void add(int e) {
	    Node temp = new Node(e);
	    if (head == null) {
	        head = temp;
	        tail = temp; // Update tail reference for the first node
	    } else {
	        tail.next = temp; 
	        tail = temp; // Update tail reference to the new node
	    }
	}

	
}

public class AddFirst {
	public static void main(String[] args) {
		Logic ll = new Logic();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(5);

		ll.printLinkedList();
	}
}
