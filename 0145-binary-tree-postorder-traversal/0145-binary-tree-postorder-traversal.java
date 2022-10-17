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
    ArrayList<Integer> array = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
      if(root==null){
          return array;
      }  
     
      postorderTraversal(root.left);
       postorderTraversal(root.right);
         array.add(root.val);
       return array;
    }
}