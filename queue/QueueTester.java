package queue;

public class QueueTester {

	public static void main(String[] args) {
		runQueueTests();
	}

		public static void runQueueTests() {
	 	

		Queue queueTester = new QueueImpl();

		queueTester.enQueue("Jan");				// Add elements to the queue
		queueTester.enQueue("Sean");
		queueTester.enQueue("Michael M");
		queueTester.enQueue("Hunter");
		queueTester.enQueue("Ronny");
		queueTester.enQueue("Michael C");

		queueTester.display();							// Display the queue

		System.out.println("Peeking the queue");		// Peek the queue
		queueTester.peek();

		queueTester.deQueue();							// Remove an element from the queue
		queueTester.display();							// Display the queue

		queueTester.enQueue("Paul");			// Add elements to the queue
		queueTester.enQueue("Jasiu");

		queueTester.peek();								// Peek the queue

		queueTester.deQueue();							// Remove an element from the queue
		queueTester.display();							// Display the queue
	}

}
