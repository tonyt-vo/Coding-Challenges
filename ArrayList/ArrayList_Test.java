package ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,15,9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		System.out.println(list.toString());

	}

}
