package com.LinkedList25FEB;

class LinkedList10 {
	Node head;
	Node tail;

	void add(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	void reversing() {
	    Node prev = null;
	    Node current = head;
	    while (current != null) {
	        Node later = current.next;  
	        current.next = prev;
	        prev = current;
	        current = later;
	    }
	    head = prev;
	}
}

public class ReverseLL {
	public static void main(String[] args) {
		LinkedList10 l1 = new LinkedList10();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		l1.printLinkedList();
        l1.reversing();
		l1.printLinkedList();

	}
}
