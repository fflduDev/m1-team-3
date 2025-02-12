package stack; 

public class StackImpl implements Stack {

        private String stack[] ;
		private int size;
		private int top = 0;


	@Override
	public void push(String newElement) {
		//If the stack is full
		if (isFull() == true) {												
			System.out.println("Stack is full, cannot push any elements");
		}

		else {
			//Add the element to the top of the stack
			stack[top] = newElement;										
			//Increment the top of the stack
			top++;
		}
	}

	@Override
	public String pop() {										
		if (isEmpty() == true) {								//If the stack is empty
			System.out.println("Stack is empty, cannot pop any elements");
		}
		else {
			String popped = stack[top];							//Store the element to be popped
			stack[top] = null;									//Remove the element from the stack
			top--;												//Decrement the top of the stack (assing the element below top to the new top)
			System.out.println(popped + " has been popped");	
			return popped;										//Return the popped element
		}

		return null;
	}

	@Override
	public Boolean isEmpty() {
		if (top == 0) {											//If the stack is empty
			return true;
		}
		return false;
	}

	@Override
	public Boolean isFull() {
		if (top == stack.length - 1) {							//If the stack is full
			System.out.println("Stack is full");				//Print that the stack is full
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		System.out.println("Size of the stack: " + size);		//Print the size of the stack
		return size;
	}

	@Override
	public String peek() {
		if (isEmpty() == true) {											//If the stack is empty
			System.out.println("Stack is empty no elements to peek");
		}
		else {
			System.out.println("Top element of the stack: " + stack[top]);	//Print the top element of the stack
			return stack[top];											
		}
		return null;
	}

	@Override
	public void setCapacity(int size) {
		this.size = size;
		this.stack = new String[size];
		
	}

	@Override
	public void display() {
		for (int i = 0; i < stack.length; i++) {				//For each element in the stack
			System.out.println(stack[i]);						//Print the element
		}		
	}
 

}
