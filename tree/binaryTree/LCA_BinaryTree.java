package binaryTree;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return LCA( root , p , q);
        
    }

    public TreeNode LCA( TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;

        if(  root == p || root == q ) return root;

        TreeNode left = LCA( root.left , p , q);
        TreeNode right = LCA( root.right , p, q);
        // condition one --> when both have address it mean lies in different parts 
        if( left != null && right != null) return root;

        // case 2
        else if( left == null) return right;

        else return left;
    }
}
