package Queue;

public class Queue<E> {

	// Fields
	private int front;
	private int rear;
	private int size;
	private E[] arr;
	
	// Default Constructor
	public Queue() {
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		this.arr = (E[]) new Object[10];
	}

	// Insert an element to the front of the list
	public void insert(E data) {
		// Check if internal array needs resizing.
		if(this.size == this.arr.length) {
			this.arr = resize(arr);
		}

		// Add the item and update the fields.
		this.arr[rear] = data;
		this.rear++;
		this.size++;
	}
	
	// Removing an element from the queue.
	public void remove() {
		if(this.size == 0) {
			throw new EmptyQueueException();
		}
		// Remove reference to the data by incrementing
		this.front++;
		// Decrement the size
		this.size--;
	}
	
	// Helping method to resize internal array
	public E[] resize(E[] arr) {
		int newSize = arr.length * 2;
		E[] newArr = (E[]) new Object[newSize];
		int index = 0;
		for(int i = front; i < front + this.size; i++) {
			newArr[index] = this.arr[i];
			index++;
		}

		return newArr;
	}

	// Size getter
	public int getSize() {
		return this.size;
	}
	
	// Check item at array
	public E peek() {
		if(this.size == 0) {
			throw new EmptyQueueException();
		}
		return this.arr[front];
	}

	// Basic toString
	public String toString() {
		String s = "";
		for(int i = front; i < rear; i++) {
			s += this.arr[i] + ", ";
		}

		return s;
	}
}
