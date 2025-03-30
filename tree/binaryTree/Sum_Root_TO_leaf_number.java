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
    public int sumNumbers(TreeNode root) {

        return sum(root , 0);
        
    }

    public int sum( TreeNode root , int tillSum){

        if( root == null) return 0;
        if( root.left == null && root.right == null) return tillSum*10 + root.val;

        int left = sum(root.left , tillSum*10 + root.val);
        int right = sum(root.right , tillSum*10 + root.val);
        return left + right;
    }
}
