package com.linked_List;

public class Intro {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}
	public static class LinkedList {
		ListNode head;

		public void insert(int val) {
			ListNode newNode = new ListNode(val);
			if (head == null) {
				head = newNode;
			} else {
				ListNode temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
		}
		public void display() {
			ListNode temp = head;
			while (temp != null) {
				System.out.print(temp.val + " -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);

		System.out.print("Linked List: ");
		list.display();
	}
}
