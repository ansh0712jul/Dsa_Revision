package binaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,targetSum);
    }
    public boolean sum(TreeNode root ,int targetSum){
        if(root ==null) return false;
        if(root.left==null && root.right==null){
            return targetSum-root.val==0;
        }
        boolean left=sum(root.left,targetSum-root.val);
        boolean right=sum(root.right,targetSum-root.val);
        return left||right;
    }
        
}
