package com.LinkedList25FEB;

class LinkedList8{
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
    Node removeDubli(Node head) {
    	if(head == null ) {
    		return null;
    	}
    	Node temp = head;
    	while(temp.next != null) {
    		if(temp.data == temp.next.data) {
    			temp.next = temp.next.next;
    		}
    		temp = temp.next;
    	}
		return head;
    }
}
public class Remove_Dublicates {
	public static void main(String[] args) {
		LinkedList8 l1 = new LinkedList8();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        
        l1.printLinkedList();
        Node dublicats = l1.removeDubli(l1.head);
        l1.printLinkedList();   
	}
}
