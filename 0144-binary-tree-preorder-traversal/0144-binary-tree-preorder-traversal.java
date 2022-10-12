class Solution {
    ArrayList<Integer> array = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
      if(root==null){
          return array;
      }  
      // array.add(root.val);
      // preorderTraversal(root.left);
      //  preorderTraversal(root.right);
      //  return array;
        Stack<TreeNode>stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
        TreeNode temp = stack.pop();
            array.add(temp.val);
            if(temp.right!=null){
           stack.push(temp.right);}
            if(temp.left!=null){
           stack.push(temp.left);}
            }
           return array;
        }

    }
