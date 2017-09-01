package array_list;

public class ArrayList<E> {

	// Fields
	private E[] arr;
	private int size;
	private double refactorAmount = 1.5;

	// Default Constructor
	public ArrayList() {
		arr = (E[]) new Object[10];
		this.size = 0;
	}

	// Add an Item 
	public void add(E data) {
		// Check if arr needs to be resized internally
		if(this.size == arr.length) {
			this.arr = transferArr(this.arr);
			arr[size] = data;
		// Add the item and increment the size
		}else {
			arr[size] = data;
		}
		this.size++;
	}
	
	// Helping method to enlarge the arr and transfer data over.
	private E[] transferArr(E[] arr) {
		int newSize = (int)(arr.length * this.refactorAmount);
		E[] newArr = (E[]) new Object[newSize];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		return newArr;
	}

	// Getters
	public int getSize() {
		return this.size;
	}
	
	// Basic toString 
	public String toString() {
		String s = "";
		for(int i = 0; i < this.size; i++) {
			s += this.arr[i] + ", "; 
		}
		return s;
	}
	
}
