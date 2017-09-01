package trie;

public class TrieNode_Test {

	public static void main(String[] args) {
		Trie test = new Trie();
		
		test.add("hello");
		test.add("he");
		boolean found = test.search("hel");
		System.out.println(found);
	}

}
