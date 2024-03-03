package doublyLinkedList;

class LinkedLL16 {
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

	void insertAtEnd(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

//	void insertAt(Node head, int idx, int newdata) {
//		Node temp = head;
//		for (int i = 0; i < idx - 1; i++) {
//			temp = temp.next;
//		}
//		Node a = temp.next;
//		Node newNode = new Node(newdata);
//
//		temp.next = newNode;
//		newNode.prev = temp;
//		newNode.next = a;
//		a.prev = newNode;
//	}
}
public class InsertAtTail {
	public static void main(String[] args) {
		LinkedLL16 l2 = new LinkedLL16();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.insertAtEnd(60);
		l2.printLinkedList();
		//l2.insertAt(l2.head, 3, 10000);
		l2.printLinkedList();
//		System.out.println("Printing head : " + l2.head.data);
//		System.out.println("Printing head next : " + l2.head.next.data);
//
//		System.out.println("Printing Tail Data : " + l2.tail.data);
//		System.out.println("Printing Tail prev data : " + l2.tail.prev.data);

	}
}
