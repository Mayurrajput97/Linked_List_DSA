package com.LinkedList25FEB;

class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	class Logic {
		Node head;

		void printLinkedList() {
			Node curr = head;
			while (curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
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
		void addFirst(int e) {
			Node temp = new Node(e);
			if(head == null) {
				head = temp;
			}
			else {
				temp.next = head;
				head = temp;
			}
		}
	}
	public class AddFirst {
		public static void main(String[] args) {
			Logic l1 = new Logic();
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(50);
			l1.addFirst(5);

			l1.printLinkedList();
		}
	}
