class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        TreeNode tempnode = new TreeNode();
        temp.add(root);
        int tempsize = temp.size();
        ArrayList right = new ArrayList<Integer>();
        if(root == null){
            return right;
        }
        while(temp.size() != 0){
            tempsize = temp.size();
            while (tempsize > 0){
                tempnode = temp.remove();
                if (tempsize == 1){
                    right.add(tempnode.val);
                }    
                if (tempnode.left != null){
                    temp.add(tempnode.left);
                }
                if (tempnode.right != null){
                    temp.add(tempnode.right);
                }
                tempsize--;
            }
              
        }
        
        return right;
    }
}
