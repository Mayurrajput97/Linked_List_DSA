package com.LinkedList25FEB;

// Program Refered By Collage Wallah
// class Node is present in another file

class LinkedList3 {
	Node head;
	Node tail;

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	void insetAt(int idx, int newdata) {
		Node t = new Node(newdata);
		if (idx < 0) {
			System.out.println("Invalid position.");
			return;
		}
		if (idx == 0) {
			t.next = head;
			head = t;
			return;
		}

		Node temp = head;
		for (int i = 1; i < idx - 1; i++) {
			if (temp == null || temp.next == null) {
				System.out.println("Invalid position. Position exceeds the length of the list.");
				return;
			}
			temp = temp.next;
		}
		t.next = temp.next;
		temp.next = t;
	}

	// Add method just for seeing the output is working properly or not

	void add(int e) {
	    Node temp = new Node(e);
	    if (head == null) {
	        head = temp;
	        tail = temp; // Updating tail reference for the first node
	    } else {
	        tail.next = temp; 
	        tail = temp; // Updating tail reference to the new node
	    }
	}

}

public class InsertAtPosition {
	public static void main(String[] args) {
		LinkedList3 list = new LinkedList3();
		list.add(10);
		list.add(20);
		list.add(30);

		list.insetAt(2, 15);
		list.printLinkedList();
	}
}
