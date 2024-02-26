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
    	Node temp = head;
    	for(int i = 1; i< idx -1; i++) {
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
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}
}
public class InsertAtPosition {
	public static void main(String[] args) {
		LinkedList3 list = new LinkedList3();
		list.add(10);
		list.add(20);
		list.add(30);
        list.insetAt(1, 15);
        list.printLinkedList();		
	}
}
