package doublyLinkedList;


class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
	}
}
class LinkedLL14 {
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
	
}
public class DoublyLL_intro {
	public static void main(String[] args) {
		LinkedLL14 l2 = new LinkedLL14();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		
		l2.printLinkedList();
	}
}