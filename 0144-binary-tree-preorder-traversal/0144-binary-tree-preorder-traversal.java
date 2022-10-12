class Solution {
    ArrayList<Integer> array = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
      if(root==null){
          return array;
      }  
      array.add(root.val);
      preorderTraversal(root.left);
       preorderTraversal(root.right);
       return array;
    }
}