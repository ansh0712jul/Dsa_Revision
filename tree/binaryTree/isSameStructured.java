package binaryTree;

// Define a custom TreeNode class for binary trees
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


class Solution {
    public boolean isSymmetric(TreeNode root) {

        return isStructureSame( root.left , root.right );
        
    }

    public boolean isStructureSame(TreeNode root1 , TreeNode root2){

        if( root1 == null && root2 == null ) return true;
        if( root1 == null || root2 == null ) return false;

        boolean left = isStructureSame( root1.left , root2.right );
        boolean right = isStructureSame( root2.left , root1.right );

        return left && right ;
    }
}

