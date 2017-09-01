package stack;
import java.util.EmptyStackException;


public class Stack<E> {
	// Fields
	private E[] arr;
	private int size;

	// Default Constructor
	public Stack() {
		this.arr = (E[])new Object[10];
		this.size = 0;
	}

	// Inserting data
	public void push(E data) {
		// Check if internal array resize is necessary.
		if(this.size == this.arr.length) {
			this.arr = transferData(this.arr);
		}
		// Update arr and increment size
		this.arr[size] = data;
		this.size++;
	}

	// Removing an item
	public E pop() {
		if(this.size == 0) {
			throw new EmptyStackException();
		}

		// Remove the item from the end of the array.
		E data = this.arr[size - 1];
		this.arr[size - 1] = null;
		this.size--;
		
		return data;
	}

	// Helping method to transfer array over.
	public E[] transferData(E[] arr) {
		int newSize = 2 * arr.length;
		E[] newArr = (E[])new Object[newSize];

		for(int i = 0; i < this.size; i++) {
			newArr[i] = arr[i];
		}

		return newArr;
	}
	
	// Look at the element at the top of the stack.
	public E peek() {
		if(this.size == 0) {
			throw new EmptyStackException();
		}
		return this.arr[this.size - 1];
		
	}

	// Basic toString method
	public String toString() {
		String s = "";
		for(int i = 0; i < this.size; i++) {
			s += this.arr[i] + ", "; 
		}
		return s;
	}

}