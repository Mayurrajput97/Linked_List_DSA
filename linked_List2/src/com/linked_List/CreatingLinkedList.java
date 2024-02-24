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

	void printLinkedList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}
public class CreatingLinkedList {
	public static void main(String[] args) {
		Logic l1 =new Logic();
		// Creating List
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);

		// Linking List 
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		l1.head = p1;
		
		l1.printLinkedList();
	}
}
