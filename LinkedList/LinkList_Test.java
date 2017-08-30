package LinkedList;

public class LinkList_Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		int[] data = {3};
		
		for(int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		
		
		System.out.println(list.toString());
		System.out.println(list.getSize());
	}

}
