package trie;

public class Trie {
	private TrieNode root;
	
	
	public void add(String s) {
		if(this.root == null) {
			this.root = new TrieNode();
		}
		TrieNode curr = root;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!curr.getChildren().containsKey(c)) {
				curr.add(c);
			}
			curr = curr.getChildren().get(c);
		}
		curr.setLeaf(true);
	}
	
	public boolean search(String s) {
		TrieNode curr = this.root;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!curr.getChildren().containsKey(c)) {
				return false;
			}
			curr = (TrieNode)curr.getChildren().get(c);
		}
		
		return curr.isLeaf();
	}
}
