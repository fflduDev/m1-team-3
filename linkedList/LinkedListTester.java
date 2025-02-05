package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		

		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("Bannow Science Center");
		tester.addItem("Rec-Plex");
		tester.addItem("Library");
		tester.addItem("Engineering Annex");

		tester.listItems();

		//Insert Before
		System.out.println("Adding Nursing Building before Bannow Science Center...");
		tester.insertBefore("Nursing-Building", "Bannow Science Center");
		tester.listItems();

		//Delete Item
		System.out.println("Deleting the Rec-Plex...");
		tester.deleteItem("Rec-Plex");
		tester.listItems();


		//Insert After
		System.out.println("Adding Dolan after Engineering Annex...");
		tester.insertAfter("Dolan", "Engineering Annex");
		tester.listItems();

		//isItemInList
		System.out.println("Checking if Nursing-Building is in the list...");
		tester.isItemInList("Nursing-Building");

	}

}
