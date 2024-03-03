package doublyLinkedList;

class LinkedLL15 {
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
	void insertAtHead(int newdata) {
        Node newNode = new Node(newdata);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
}
public class InsertionAtHead {
	public static void main(String[] args)
	{
		LinkedLL15 l2 = new LinkedLL15();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		
		l2.printLinkedList();
        l2.insertAtHead(5);
        l2.insertAtHead(2);
		l2.printLinkedList();
		
	}
}
