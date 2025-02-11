package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		

		
		LinkedList tester = new LinkedListImpl();

		//Create (insert) 4 stations
		tester.addItem("Bannow Science Center");							
		tester.addItem("Rec-Plex");
		tester.addItem("Library");
		tester.addItem("Engineering Annex");
		
		//List the items
		tester.listItems();															
		System.out.println("------------------------------------------------");

		//Check if item is in list (False)
		System.out.println("Checking if Nursing-Building is in the list...");
		tester.isItemInList("Nursing-Building");

		System.out.println("Checking if Engineering Annex is in the list...");
		tester.isItemInList("Engineering Annex");
		
		System.out.println("------------------------------------------------");

		//Delete Item
		System.out.println("Deleting the Rec-Plex...");
		tester.deleteItem("Rec-Plex");
		tester.listItems();

		System.out.println("------------------------------------------------");

		//Insert Before
		System.out.println("Adding Nursing Building before Bannow Science Center...");
		tester.insertBefore("Nursing-Building", "Bannow Science Center");
		tester.listItems();

		System.out.println("------------------------------------------------");

		//Insert After
		System.out.println("Adding Dolan after Engineering Annex...");
		tester.insertAfter("Dolan", "Engineering Annex");
		tester.listItems();

		System.out.println("------------------------------------------------");

	}

}
