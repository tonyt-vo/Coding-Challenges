package LinkedList;

public class LinkedList<E> {
	private Node head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public LinkedList(E data) {
		head = new Node(data);
		this.size = 1;
	}

	public void add(E data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node newNode = new Node(data);
			Node curr = head;
			while(curr.hasNext()) {
				curr = curr.getNext();
			}

			curr.addNext(newNode);
		}
		this.size++;
	}

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
	
	public int getSize() {
		return this.size;
	}

	// 
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
