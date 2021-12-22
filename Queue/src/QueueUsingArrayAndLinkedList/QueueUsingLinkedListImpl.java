package QueueUsingArrayAndLinkedList;

public class QueueUsingLinkedListImpl {
	Node head; // Pointer to the first element of the queue
	Node tail; // Pointer to the last element of the queue
	int size;
	// Constructor
	public QueueUsingLinkedListImpl(int data) {
		Node node = new Node(data);
		this.head = this.tail = node;
		this.size = 1;
	}
	
	// Adds a new node to the tail of the list
	void enqueue (Node toAdd) {
		if(tail != null) {
			tail.next = toAdd;
		}
		tail = toAdd;
		if (head == null) {
			head = toAdd;
		}
		size++;
	}
	
	// Removes the element at the head of the list and returns its value
	int dequeue() {
		if(head != null) {
			int data = head.value;
			head = head.next;
			size--;
			return data;
		}
		if(head == null) tail = null;
		size--;
		return -1;
	}
	
	// Checks if the queue is empty
	boolean isEmpty() {
		return head == null;
	}
	
	// Returns the value of the head of the list
	int peek() {
		return head.value;
	}
		
	static class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	};	
}
