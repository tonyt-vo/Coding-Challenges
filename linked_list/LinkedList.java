package linked_list;

public class LinkedList<E> {
	
	// Fields
	private Node head;
	private int size;

	// Default Constructor
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	// Constructor for a head node
	public LinkedList(E data) {
		head = new Node(data);
		this.size = 1;
	}

	// Add a new link
	public void add(E data) {
		// Adding first element.
		if(head == null) {
			head = new Node(data);
		}else {
			
			Node curr = head;
			while(curr.hasNext()) {
				curr = curr.getNext();
			}
			Node newNode = new Node(data);
			curr.addNext(newNode);
		}
		this.size++;
	}

	// Remove an item from the List
	public void remove(E data) {
		// Case 1: head is null, linkedlist is empty
		if(head == null) {
			throw new IllegalArgumentException("Linked list is already empty");
		}
		// Case 2: Head has the data
		if(head.getData() == data) {
			head = head.getNext();
			this.size--;
		}
		Node curr = head;
		Node newNode = new Node(data);
		while(curr.hasNext()) {
			Node prev = curr;
			curr = curr.getNext();
			if(curr.getData() == data) {
				// Case 3: Target data is within the array
				if(curr.hasNext()) {
					prev.changeNext(curr.getNext());
					// Case 4: Target data is the last element.
				}else {
					prev.changeNext(null);
				}
				this.size--;
			}
		}
	}
	
	// Check if list contains an item.
	public boolean contains(E data) {
		Node curr = head;
		while(curr != null) {
			if(curr.getData() == data) {
				return true;
			}
			curr = curr.getNext();
		}
		
		return false;
	}
	
	// Size getter
	public int getSize() {
		return this.size;
	}

	// Returns a visual of the list.
	public String toString() {
		Node temp = head;
		String s = "";
		while(temp != null) {
			s += "[" + temp.getData() + "]" + " -> ";
			temp = temp.getNext();
		}
		return s += "null";
	}
}
