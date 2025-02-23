package app;

import linkedList.LinkedListTester;
import queue.QueueTester;
import stack.StackTester;

public class StagBusClient {

	public static void main(String[] args) {
		// call LinkedListTestMethod
		LinkedListTester LinkedListTestMethod = new LinkedListTester();
		QueueTester QueueTestMethod = new QueueTester();
		StackTester StackTestMethod = new StackTester();


		System.out.println("-----L I S T  T E S T------");
		LinkedListTestMethod.runLinkedListTest();

 		
		System.out.println("-----S T A C K  T E S T------");
		StackTestMethod.runStackTests();
	 
		System.out.println("----Q U E U E  T E S T-------");
		QueueTestMethod.runQueueTests();
		
	 	}

}
