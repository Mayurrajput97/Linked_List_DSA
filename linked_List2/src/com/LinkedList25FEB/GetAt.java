package com.LinkedList25FEB;

class LinkedList4 {
	Node head;
	Node tail;

	void add(int e) {
	    Node temp = new Node(e);
	    if (head == null) {
	        head = temp;
	        tail = temp; // Update tail reference for the first node
	    } else {
	        tail.next = temp; // Add new node after the current tail
	        tail = temp; // Update tail reference to the new node
	    }
	}


	int getAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}

public class GetAt {
	public static void main(String[] args) {
		LinkedList4 l1 = new LinkedList4();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);

		l1.printLinkedList();
		System.out.println();
		System.out.println("The Element at Given Index is : " + l1.getAt(1));
	}

}
