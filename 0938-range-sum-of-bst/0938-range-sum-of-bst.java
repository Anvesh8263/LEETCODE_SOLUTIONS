
class Solution {
 
    int rangeSum = 0;
  public int rangeSumBST(TreeNode root, int low, int high) {
    if(root == null) return 0;
    if(root.val < low) return rangeSumBST(root.right, low, high);
    else if (root.val > high) return rangeSumBST(root.left, low, high);
    else {
      rangeSumBST(root.left, low, high);
      rangeSum += root.val;
      rangeSumBST(root.right, low, high);
      return rangeSum;
    }
  }
}
