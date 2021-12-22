package QueueUsingArrayAndLinkedList;

import QueueUsingArrayAndLinkedList.QueueUsingLinkedListImpl.Node;

public class Test {
	public static void main (String [] args) {
		Node node = new Node(10);
		Node tail = new Node(12);
		QueueUsingLinkedListImpl queue = new QueueUsingLinkedListImpl(10);
		System.out.println(queue.isEmpty() + " Should not be empty");
		queue.enqueue(node);
		System.out.println(queue.size);
		// [10, 10]
		queue.enqueue(tail);
		// [10, 10, 12]
		System.out.println(queue.isEmpty() + " Should not be empty");
		queue.dequeue();
		// [10, 12]
		queue.dequeue();
		// [12]
		System.out.println(queue.isEmpty() + " Should not be empty");
		queue.dequeue();
		System.out.println(queue.isEmpty() + " Should be empty");

	}
}
