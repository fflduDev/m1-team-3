package stack;

public class StackTester {

	public static void main(String[] args) {
		runStackTests();
	}

	public static void runStackTests() {
		Stack stackTester = new StackImpl();
		
		stackTester.setCapacity(9);			//Set the capacity of the stack

		stackTester.push("Jan");					//Add elements to the stack
		stackTester.push("Sean");
		stackTester.push("Michael M");
		stackTester.push("Hunter");
		stackTester.push("Ronny");
		stackTester.push("Michael C");

		stackTester.display();						//Display the stack

		System.out.println("Peeking the stack");	//Peek the stack
		stackTester.peek();
		stackTester.pop();							//Remove an element from the stack
		stackTester.display();						//Display the stack
		stackTester.peek();							//Peek the stack

		stackTester.push("Paul");					//Add elements to the stack
		stackTester.push("Jasiu");

		stackTester.peek();							//Peek the stack
		
		stackTester.pop();							//Remove all elements from the stack
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.isEmpty();						//Check if the stack is empty
		stackTester.display();						//Display the stack

	 	
	}

}
