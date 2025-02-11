package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		
		ListItem current = head;
		while(current != null) {
			if(current.data.equals(thisItem)) {
				System.out.println("True, " + thisItem + " is in the list.");
				return true;
			}
			current = current.next;
		}
		System.out.println("False, " + thisItem + " is not in the list.");

		return null;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		if (head == null) {
			head = new ListItem(thisItem);
			return true;
		}
		ListItem current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new ListItem(thisItem);
	
		return null;
	}

	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem current = head;									
		while(current != null) {									
			count ++;					
			current = current.next;									
		}
		System.out.println("Number of items in the list: " + count);
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head;									//Start at the head of the list
		while(current != null) {									//While there exists a ListItem
			System.out.println(current.data);						//Print the data of the current ListItem
			current = current.next;									//Move to the next ListItem
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if (head == null) {
			return false;
		}

		ListItem current = head;
		while(current.next != null) {								//While there exists a ListItem after the current ListItem
			if(current.next.data.equals(thisItem))					//If the data of the next ListItem is the data we want to delete
				current.next = current.next.next;					//Set the pointer of the current ListItem to the ListItem after the next ListItem (1->2->3 becomes 1->3)
			else
				current = current.next;
		}
		return false;												//Return false if the item to delete was not found
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
	    if (head == null) {
	        return false; 											//Return false if the list is empty
	    }

		if (head.data.equals(itemToInsertBefore)) { 				// Special case for inserting before the head
			ListItem newHead = new ListItem(newItem);
			newHead.next = head;
			head = newHead;
			return true;
		}

	    ListItem current = head;
	    while (current.next != null) { 								//While there exists a ListItem after the current ListItem
	        if (current.next.data.equals(itemToInsertBefore)) { 	//If the data of the next ListItem is the data we want to insert before
	            ListItem temp = current.next; 						//Create a temporary ListItem to store the next ListItem
	            current.next = new ListItem(newItem); 				//Set the pointer of the current ListItem to the new ListItem
	            current.next.next = temp; 							//Set the pointer of the new ListItem to the temporary ListItem
	            return true;
	        }
	        current = current.next; 								//Move to the next ListItem
	    }
	    return false; 												//Return false if the item to insert before was not found
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		if (head == null) {
			return false; 											//Return false if the list is empty
		}

	    ListItem current = head;
	    while (current != null) { 									//While there exists a ListItem after the current ListItem
	        if (current.next.data.equals(itemToInsertAfter)) { 		//If the data of the next ListItem is the data we want to insert before
	            ListItem temp = current.next; 						//Create a temporary ListItem to store the next ListItem
	            current.next = new ListItem(newItem); 				//Set the pointer of the current ListItem to the new ListItem
	            current.next.next = temp; 							//Set the pointer of the new ListItem to the temporary ListItem
	            return true;
	        }
	        current = current.next; 								//Move to the next ListItem
	    }
		return false; 												//Return false if the item to insert before was not found
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
