package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		stackTester.setCapacity(5);
		stackTester.display();
		System.out.println("--------------------");
		System.out.println("Popping the top element");
		stackTester.pop();
		stackTester.display();





	}
	
	public static void runTests(Stack stack) {
	 	
	}

}
