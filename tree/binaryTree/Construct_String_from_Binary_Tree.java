package binaryTree;

public class Construct_String_from_Binary_Tree {
    
}



class Solution {
    public String tree2str(TreeNode root) {

        

        if(root == null) return "";
        
        String ans = Integer.toString(root.val);
        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if(root.left == null && root.right == null) return  ans;

        if(root.left == null) return ans + "()"+"(" + right+ ")";
        if(root.right == null) return ans + "(" + left + ")";

        

         return ans + "(" + left + ")" + "(" + right + ")";
        
    }
}