package Queue;
public class Queue_Test{

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
//		int[] data = {1,2,3,4,5,6,7,8,9,10,2,1,23,3};
//		for(int i = 0; i < data.length; i++) {
//			queue.insert(data[i]);
//		}
		queue.remove();
		System.out.println(queue);
		System.out.println(queue.getSize());
		
	}
}