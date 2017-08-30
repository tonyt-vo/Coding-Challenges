package Stack;

public class Stack_Test {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		int[] data = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < data.length; i++) {
			stack.push(data[i]);
		}
		
		System.out.println(stack);
		
	}
}
