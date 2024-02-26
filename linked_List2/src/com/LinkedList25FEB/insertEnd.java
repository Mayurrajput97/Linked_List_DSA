package com.LinkedList25FEB;
// Program Refered By Collage Wallah
// class Node is present in another file

class LinkedList1 {
    Node head;
    Node tail;
    void insertAtEnd(int newData) {
        Node temp = new Node(newData);
        if (head == null) {
            head = temp;
        }
        else {
        	tail.next = temp;
        }
        tail = temp;
    }
    void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
public class insertEnd {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        
        list.printLinkedList();		
	}
}
