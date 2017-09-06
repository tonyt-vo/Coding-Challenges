package leetcode;

public class SingleNumber {

/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/	
	public static void main(String[] args) {

	}

	/*Algorithm: 
	* 1. Put everything in the hash table. Key is Integer, Value is Number of Occurrances.
	* 2. Loop through HashTable and find the one that has exactly one occurance.
	*
	* Time Complexity: O(n + n) => O(n)
	*	O(n) for looping through the array to add to HashMap
	*	O(n) might be the last element in the map that has the one occurance
	*
	* Space Complexity: O(n)
	* We initialize a HashMap and it contains n elements from the input array.
	*/

	public int singleNumber(int[] nums) {
		// HashTable Approach
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if(!map.keySet().contains(number)) {
                map.put(number, 1);
            }else {
                map.put(number, map.get(number) + 1);
            }
        }
        
        for(Integer i: map.keySet()) {
            if(map.get(i) == 1) {
                return i;
            }
        }
        return -1;
	}
}