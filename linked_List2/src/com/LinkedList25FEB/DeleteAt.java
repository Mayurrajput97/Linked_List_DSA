package com.LinkedList25FEB;

class LinkedList5 {
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

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println(); // Print newline after printing list
	}

	void deleteAt(int idx) {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}

		if (idx == 0) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
			return;
		}

		Node temp = head;
		for (int i = 1; i < idx - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
		if (temp.next == null) {
			tail = temp;
		}
	}
}

public class DeleteAt {
	public static void main(String[] args) {
		LinkedList5 l1 = new LinkedList5();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);

		l1.deleteAt(3);
		System.out.println("After Deletion:");
		l1.printLinkedList();
		System.out.println(l1.tail.data);
	}
}
