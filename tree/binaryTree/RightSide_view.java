package binaryTree;

import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    int visited = -1;
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans  = new ArrayList<>();
        view( root , 0 , ans);
        return ans;
        
    }

    public void view(TreeNode root , int level , List<Integer> ans){

        if( root == null) return;

        if( level > visited){
            ans.add(root.val);
            visited = level;
        } 
        view(root.right , level+1 , ans);
        view(root.left , level+1 , ans);
        
        
    }

      
}