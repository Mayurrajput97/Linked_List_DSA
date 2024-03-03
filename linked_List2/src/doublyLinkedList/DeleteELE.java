package doublyLinkedList;

class LinkedLL19 {
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

// Delete At Head : 
	void deleteELE() {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}

		head = head.next;
		head.prev = null;
	}

	// Delete At Tail :
	void deleteAtTail() {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		tail = temp;
		temp.next = null;
	}
}

public class DeleteELE {
	public static void main(String[] args) {
		LinkedLL19 l2 = new LinkedLL19();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.printLinkedList();
		// l2.deleteELE();
		// l2.deleteAtTail();
		l2.printLinkedList();
		System.out.println("head " + l2.head.data);
		System.out.println("tail " + l2.tail.data);
	}
}
