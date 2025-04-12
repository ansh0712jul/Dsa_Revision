package binaryTree;


// TC : O(n)
// class Solution {
//     int ans=0;
//     public int pathSum(TreeNode root, int targetSum) {
//         return path(root,targetSum);
//     }
//     public static int path(TreeNode root ,long targetSum ){
//         if(root==null) return 0;
//        int c=count(root,targetSum);
//        int l=path(root.left,targetSum); 
//        int r=path(root.right,targetSum);
//        return l+r+c;
//     }
//     public static int count(TreeNode root ,long targetSum ){
//         if(root== null) return 0;
//         int cnt=0;
//         if(root.val-targetSum==0) cnt++;
//         int left=count(root.left,targetSum-root.val);
//         int right=count(root.right,targetSum-root.val);
//         return left+right+cnt;
//     }
// }

// optimized approach using hashmap

