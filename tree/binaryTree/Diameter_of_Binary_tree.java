package binaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


// TC : O(n^2)
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {

//         if(root == null) return 0;

//         int ld = diameterOfBinaryTree(root.left);
//         int rd = diameterOfBinaryTree(root.right);
//         int sd = height(root.left) + height(root.right) +2 ; // khudse pass hone waala
//         return Math.max(Math.max(ld, rd), sd);
        
        
//     }


//     public static int height(TreeNode root){

//         if(root == null) return -1;

//         int left = height(root.left);
//         int right = height(root.right);
//         return 1 + Math.max(left , right);
//     }
// }


// TC : O(n)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        return diameter(root).dt;

    }

    public DiaPair diameter(TreeNode root) {
        if(root == null) return new DiaPair();

        DiaPair ldp = diameter(root.left); //[d,h]
        DiaPair rdp = diameter(root.right); //[d,h]

        DiaPair sdp = new DiaPair(); // [d,h]
        int sd = ldp.ht + rdp.ht + 2; // khudse pass hone waala
        sdp.dt = Math.max(Math.max(ldp.dt, rdp.dt), sd);
        sdp.ht = 1 + Math.max(ldp.ht, rdp.ht);
        return sdp;
        
    }
    
}

class DiaPair {
    int dt = 0;
    int ht = -1;
}

