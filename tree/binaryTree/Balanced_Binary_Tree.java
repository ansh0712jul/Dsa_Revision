package binaryTree;

// TC : O(n^2)
// class Solution {
//     public boolean isBalanced(TreeNode root) {

//         return balanced(root);
        
//     }
//     public static boolean balanced(TreeNode root) {

//         if(root == null) return true;

//         boolean lb = balanced(root.left);
//         boolean rb = balanced(root.right);
//         boolean sb = Math.abs( ht(root.left) - ht(root.right)) <= 1;

//         return lb && rb && sb;
//     }

//     public static int ht(TreeNode root){

//         if(root == null) return -1;
        
//         int left = ht(root.left);
//         int right = ht(root.right);
//         return Math.max(left , right) + 1;
//     }
// }


class Solution {
    public boolean isBalanced(TreeNode root) {

        return balanced(root).balanced;
    }

    public static HtPair balanced(TreeNode root) {

        if (root == null) return new HtPair();

        HtPair lhp = balanced(root.left);
        HtPair rhp = balanced(root.right);

        HtPair shp = new HtPair();
        shp.ht = 1 + Math.max(lhp.ht, rhp.ht);

        boolean sb = Math.abs(lhp.ht - rhp.ht) <= 1;
        shp.balanced = lhp.balanced && rhp.balanced && sb;
        return shp;
    }
}

class HtPair {
    int ht = -1;
    boolean balanced = true;
}