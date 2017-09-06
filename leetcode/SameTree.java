/*
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
*/

class SameTree {
	/*Algorithm: 
	* 1. If both nodes are null, I've reached the end and can return.
	* 2. If I've reached the end where one of the nodes is null, it means
	*	 one tree is larger than the other. Return false
	*
	* Time Complexity: O(n) where n represents the number of nodes for the smaller tree.
	*	
	*
	* Space Complexity: O(n)
	* Since this is recursion, this will put a call on the stack until we've reached a base case.
	*/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return true;
        }else {
            if(p.val != q.val) {
                return false;
            }else {
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }
        }
    }
}