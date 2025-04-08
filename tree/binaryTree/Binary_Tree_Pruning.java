package binaryTree;

// delete the subtree containing 0 node



class Solution {
    public TreeNode pruneTree(TreeNode root) {

        return prunnigTree(root);
        
    }

    public TreeNode prunnigTree(TreeNode root) {

        if(root == null) return null;

        root.left = prunnigTree(root.left);
        root.right = prunnigTree(root.right);

        if(root.left == null && root.right == null && root.val == 0) return null;

        return root;
    }
}