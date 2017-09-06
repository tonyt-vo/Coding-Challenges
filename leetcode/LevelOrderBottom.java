/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).
*/

class LevelOrderBottom {
    /*Algorithm: 
    * 1. Do a BFS each time add each node at each level to the list.
    * 2. Add to the front since BFS will give you top to bottom ordering.
    *    
    *
    * Time Complexity: O(n) where n represents the number of nodes for the tree.
    *   
    *
    * Space Complexity: O(n)
    * The Returned list will return h level lists
    * The total number of elements in the lists will be represented by
    * the number of nodes in the tree.
    */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) {
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode removed = queue.remove();
                if(removed.left != null) {
                    queue.add(removed.left);
                }
                if(removed.right != null) {
                    queue.add(removed.right);
                }
                level.add(removed.val);
            }
            list.add(0,level);
        }
        return list;
    }
}
