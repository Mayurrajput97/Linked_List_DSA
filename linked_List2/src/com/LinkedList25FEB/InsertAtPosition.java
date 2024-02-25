package com.LinkedList25FEB;

// Node Class created in Different file
class LinkedList3{
	Node head;
	void add(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}
	void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
	void insertAtPosition(int e, int position) {
        Node newNode = new Node(e);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 0; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Invalid position. Insertion failed.");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

}
public class InsertAtPosition {
	public static void main(String[] args) {
		LinkedList3 l1 = new LinkedList3();
		l1.add(10);
		l1.add(20);
		l1.add(30);
        l1.insertAtPosition(25, 2);

		l1.printLinkedList();
	}
}
