package trie;

import java.util.HashMap;

public class TrieNode {
	private HashMap<Character,TrieNode> children;
	private boolean isLeaf;
	
	public TrieNode() {
		this.children = new HashMap<Character,TrieNode>();
		this.isLeaf = false;
	}
	
	public HashMap<Character, TrieNode> getChildren() {
		return this.children;
	}
	
	public void add(char c) {
		this.children.put(c, new TrieNode());
	}
	public boolean isLeaf() {
		return this.isLeaf;
	}
	
	public void setLeaf(boolean value) {
		this.isLeaf = value;
	}
}
