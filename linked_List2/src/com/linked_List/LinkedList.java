package com.linked_List;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
	}
}
