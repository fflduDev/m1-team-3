package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		
		ListItem current = head;
		while(current != null) {
			if(current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}

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


		
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
	
		return null;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		ListItem current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if (head == null) {
			return false;
		}

		ListItem current = head;
		while(current.next != null) {				//While there exists a ListItem after the current ListItem
			if(current.next.data.equals(thisItem))			//If the data of the next ListItem is the data we want to delete
				current.next = current.next.next;	//Set the pointer of the current ListItem to the ListItem after the next ListItem (1->2->3 becomes 1->3)
			else
				current = current.next;
		}
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
