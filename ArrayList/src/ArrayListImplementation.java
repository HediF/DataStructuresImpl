public class ArrayListImplementation <E> {
	
	   private static final int INITIAL_CAPACITY = 10;
	   public int capacity;
	   public int currentSize;
	   private Object[] elements = {}, temp= {};
	   	   
	   // Default Constructor
	   public ArrayListImplementation() {
		   elements = new Object[INITIAL_CAPACITY];
		   this.capacity = INITIAL_CAPACITY;
		   this.currentSize = 0;
	   }  

	   // Constructor
	   public ArrayListImplementation(int capacity) {
		   this.capacity = capacity;
		   this.currentSize = 0;
		   elements = new Object[capacity];
	   }  
	   
	   // Checks if the ArrayList is empty
	   boolean isEmpty() {
		   return elements[0] == null;
	   }
	   
	   // Method to add a new element inside the ArrayList
	   void add (Object obj) {
		   if(currentSize == capacity) {
		      temp = elements.clone();
		      elements = new Object[2 * capacity];  //myObject pointer big size data structure
		      System.arraycopy(temp, 0, elements, 0, currentSize);
		      elements[currentSize] = obj;
		      capacity *= 2;
			  currentSize++;
		   } else {
			   elements[currentSize] = obj;
			   currentSize++;
		   }
	   }
	   
	   // Method to delete the content of the ArrayList
	   void clear() {
		   Object[] newArray = new Object[INITIAL_CAPACITY];
		   elements = newArray;
	   }
	   
	   // Method to get the object at index i
	   Object get(int index) {
		   return elements[index];
	   }
}
