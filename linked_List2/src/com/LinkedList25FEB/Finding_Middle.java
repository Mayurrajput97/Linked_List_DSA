package com.LinkedList25FEB;

class LinkedList6 {
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

    Node middleEle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    Node middleEvenLeft(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

public class Finding_Middle {
    public static void main(String[] args) {
        LinkedList6 l1 = new LinkedList6();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        
        l1.printLinkedList();
        Node middle = l1.middleEle(l1.head);
        System.out.println("Middle element: " + middle.data);
        
        System.out.println();
        
        Node middleleft = l1.middleEvenLeft(l1.head);
        System.out.println("Middle element: " + middleleft.data);
    }
}
