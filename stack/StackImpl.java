package stack; 

public class StackImpl implements Stack {

        private String stack[] ;
		private int size;
		private int top = 0;


	@Override
	public void push(String newElement) {
		//If the stack is full
		if (isFull() == true) {	
			isEmpty();											//Print that the stack is full											
			System.out.println("Cannot push " + newElement); 
		}

		else {
			stack[top] = newElement;								//Add the new element to the stack
			top++;													//Increment the top of the stack
			System.out.println("===================================");
			System.out.println(newElement + " has been pushed");
			System.out.println("===================================");
		}
	}

	@Override
	public String pop() {										
		if (isEmpty() == true) {								//If the stack is empty
			isEmpty();											//Print that the stack is empty
		}
		else {
			String popped = stack[top-1];							//Get the element to be popped
			stack[top-1] = null;									//Remove the element from the stack
			top--;													//Decrement the top of the stack (assing the element below top to the new top)
			System.out.println("===================================");
			System.out.println(popped + " has been popped");
			System.out.println("===================================");	
			return popped;											//Return the popped element
		}

		return null;
	}

	@Override
	public Boolean isEmpty() {
		if (top == 0) {											//If the stack is empty
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	@Override
	public Boolean isFull() {
		if (top == stack.length) {								//If the stack is full
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
			isEmpty();														//Print that the stack is empty
		}
		else {
			System.out.println("Top element of the stack: " + stack[top-1]);	//Print the top element of the stack
			return stack[top-1];												//Return the top element of the stack										
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
		System.out.println("===============================");
            for (String stack1 : stack) {
                //For each element in the stack
                System.out.println(stack1); //Print the element
            }
			System.out.println("===============================");
	}
 

}
