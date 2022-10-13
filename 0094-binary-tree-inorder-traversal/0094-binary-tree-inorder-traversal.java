/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<Integer>();
        helper(root,List);
        return List;
        
    }
    private void helper(TreeNode node, List<Integer>List){
        if(node==null){
            return;
}
        helper(node.left,List);
        List.add(node.val);
        helper(node.right,List);
    }
}