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

        return checkMirror( root.left , root.right );
        
    }

    public boolean checkMirror(TreeNode root1 , TreeNode root2){

        if( root1 == null && root2 == null ) return true;
        if( root1 == null || root2 == null ) return false;
        if( root1.val != root2.val ) return false;

        boolean left = checkMirror( root1.left , root2.right );
        boolean right = checkMirror( root2.left , root1.right );

        return left && right ;
    }
}

