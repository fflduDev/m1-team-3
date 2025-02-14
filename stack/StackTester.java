package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		
		stackTester.setCapacity(10);

		stackTester.push("Jan");
		stackTester.push("Sean");
		stackTester.push("Michael M");
		stackTester.push("Hunter");
		stackTester.push("Ronnie");
		stackTester.push("Michael C");
		stackTester.push("Paul");
		stackTester.push("James");
		stackTester.push("Jasiu");

		stackTester.display();

		System.out.println("Popping the top element");
		stackTester.pop();
		
		stackTester.display();





	}
	
	public static void runTests(Stack stack) {
	 	
	}

}
