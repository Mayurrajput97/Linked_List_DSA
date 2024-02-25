package com.LinkedList25FEB;
// class Node is present in another file

class LinkedList1 {
    Node head;
    void insertAtEnd(int newData) {
        Node temp = new Node(newData);
        if (head == null) {
            head = temp;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = temp;
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
        
        list.printLinkedList();		
	}
}
