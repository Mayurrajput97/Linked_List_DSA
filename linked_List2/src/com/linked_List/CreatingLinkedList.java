package com.linked_List;

 class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

// Creating Class for Logic 
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

public class CreatingLinkedList {
	public static void main(String[] args) {
		Logic l1 = new Logic();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);

		l1.printLinkedList();
		System.out.println();
		System.out.println(l1.tail.data);
	}
}
