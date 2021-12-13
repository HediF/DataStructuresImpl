
public class LinkedList {
	Node head ;
	
	LinkedList(Node head){
		this.head = head;
	}
	
	// Method to add a new Node to the end of the LinkedList
	void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(data);
	}
	
	// Method to add a new head to the LinkedList
	void reappend (int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	// Method to remove a node containing a certain value from the LinkedList
	void remove(int data){
		if(head==null) {
			return;
		}
		if(head.value==data) {
			head = head.next;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!= null) {
			if (currentNode.next.value==data) {
				currentNode.next=currentNode.next.next;
			}
			currentNode = currentNode.next;
		}		
	}
}

class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
	}
}

