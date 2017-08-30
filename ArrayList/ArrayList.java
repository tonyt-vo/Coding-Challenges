package ArrayList;

public class ArrayList<E> {

	private E[] arr;
	private int size;
	private double refactorAmount = 1.5;
	public ArrayList() {
		arr = (E[]) new Object[10];
		this.size = 0;
	}

	public void add(E data) {
		if(this.size == arr.length) {
			this.arr = transferArr(this.arr);
			arr[size] = data;
		}else {
			arr[size] = data;
		}
		this.size++;
	}
	
	private E[] transferArr(E[] arr) {
		int newSize = (int)(arr.length * this.refactorAmount);
		E[] newArr = (E[]) new Object[newSize];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		return newArr;
	}
	public int getSize() {
		return this.size;
	}
	public int getArrayListSize() {
		return this.arr.length;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < this.size; i++) {
			s += this.arr[i] + ", "; 
		}
		return s;
	}
	
}
