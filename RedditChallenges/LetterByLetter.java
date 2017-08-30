package RedditChallenges;
// Tony Vo
// 12/23/16
// Coding Challenge #277
// https://www.reddit.com/r/dailyprogrammer/comments/
// 5hy8sm/20161212_challenge_295_easy_letter_by_letter/

public class LetterByLetter {

	public static void main(String[] args) {
		
//		transform("The quick","Fun cools");
	}
	// Given two strings, transform one to the other letter by letter.
	public static void transform(String one, String two) {
		if(one.length() != two.length()) {
			throw new IllegalArgumentException();
		}
		System.out.println("String one : " + one);
		System.out.println("String two : " + two + "\nTRANSFORM\n");
		System.out.println(two);
		
		int index = 0;
		// Transform to char array for ease of char manipulation.
		char[] s2 = two.toCharArray();
		while(!one.equals(two)) {
			
			// Change each index.
			s2[index] = one.charAt(index);
			String s = "";
			
			// Recreate the string
			for(int i = 0; i < one.length(); i++) {
				s+= s2[i];
			}
			
			// Increment and print.
			index++;
			two = s;
			System.out.println(two);
		}
	}
}
