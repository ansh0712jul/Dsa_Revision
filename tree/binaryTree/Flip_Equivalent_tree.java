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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        return isMirror( root1 , root2 );
        
    }

    public boolean isMirror( TreeNode root1, TreeNode root2 ) {

        if(root1 == null && root2 == null) return true;
        if( root1 == null || root2 == null) return false;
        if( root1.val != root2.val ) return false;

        // call for to check mirror
        boolean m = isMirror( root1.left , root2.right ) && isMirror( root1.right , root2.left);
        // call to check are trees similar
        boolean simi = isMirror( root1.left , root2.left) && isMirror(root1.right , root2.right);

        return m || simi ;
    }
}
