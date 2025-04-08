package binaryTree;



class Solution {
    int cnt = 0;
    public int goodNodes(TreeNode root) {

        dfs( root , root.val);
        return cnt;
        
    }

    public  void dfs(TreeNode root , int val){

        if(root == null) return ;

        if( root.val >= val) cnt++;

        dfs(root.left , Math.max(root.val , val));
        dfs(root.right , Math.max(root.val , val));


    } 
}