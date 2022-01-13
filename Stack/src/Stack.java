public class Stack {
	public int INITIAL_CAPACITY = 10;
	public int[] stack;
	public int top;
	public int capacity;
	
	Stack() {
		stack = new int [INITIAL_CAPACITY];
		capacity = INITIAL_CAPACITY;
		top = -1;
	}
	
	// Method to verify if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	// Method to verify if the stack is full
	public boolean isFull() {
		return top == --capacity;
	}
	
	// Method to add a new element to the stack at the top
	public void push(int value) {
		if(isFull()) {
			System.out.println("Your Stack is already full");
			return;
		}
		stack[++top] = value;
	}
	
	// Method to remove the last element of the stack and return its value
	public int pop() {
		if(isEmpty()) {
			System.out.println("Your Stack is already empty");
		}
		int dataTop = stack[top--];
		return dataTop;
	}
	
	// Method to return the value of the element at the top of the stack
	public int peek() {
		return stack[top];
	}
	
	// Method to return the index of an element in the stack if found or -1 if not found
	public int search(int value) {
		if(isEmpty()) return -1;
		for(int i = 0; i<top; i++) {
			if(stack[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
