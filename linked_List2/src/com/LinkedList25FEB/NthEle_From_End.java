package com.LinkedList25FEB;
class LinkedList7 {
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
	}
	Node nthElement(Node head, int n) {
		Node slow = head;
		Node fast = head;
		
		for(int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
public class NthEle_From_End {
    public static void main(String[] args) {
    	LinkedList7 l1 = new LinkedList7();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		int n = 2;
        Node nthNode = l1.nthElement(l1.head, n);
        System.out.println("The " + n + "th element from the end is: " + nthNode.data);
    }
}

