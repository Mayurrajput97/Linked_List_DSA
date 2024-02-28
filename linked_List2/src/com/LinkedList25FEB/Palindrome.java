package com.LinkedList25FEB;

class LinkedList9{
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
    public boolean isPalindrome(Node head) {
    	
    	
    	
		return false;
    	
    }

}




public class Palindrome {
	public static void main(String[] args) {
	}

}
