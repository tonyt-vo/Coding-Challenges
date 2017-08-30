package LinkedList;

public class Node<E> {
	private Node<E> next;
	private E data;
	
	public Node(E data) {
		this.data = data;
	}
	
	public void addNext(Node<E> next) {
		this.next = next;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	public E getData() {
		return this.data;
	}
	
	public boolean hasNext() {
		return this.next != null;
	}
	
	public void changeNext(Node newNext) {
		this.next = newNext;
	}
}
