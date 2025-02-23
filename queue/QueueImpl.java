package queue;

public class QueueImpl implements Queue {

	int length = 10;
	String queue[] = new String[length];
	int size = 0;

	@Override
	public boolean isFull() {
		if (size == length) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) {
		if (isFull() == true) {
			System.out.println("Queue is full");
		} else {
			queue[size] = element;
			size++;
		}
	}

	@Override
	public String deQueue() {
		if (isEmpty() == true) {
			isEmpty();
		} else {
			for (int i = 0; i < size; i++) {
				queue[i] = queue[i + 1];
			}
			size--;
		}
		return null;
	}

	@Override
	public void display() {
		System.out.println("===============================");
		for (String queue1 : queue) {									// For each element in the queue
			System.out.println(queue1); 								// Print the element
		}
		System.out.println("===============================");
		
	}

	@Override
	public String peek() {
		if (isEmpty() == true) {											// If the queue is empty
			isEmpty();														// Print that the queue is empty
		} else {
			System.out.println("First element of the queue: " + queue[0]);	// Print the first element of the queue
			return queue[0];												// Return the first element of the queue
		}
		return null;
	}

}
