package binaryTree;
import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) {

         HashMap< Integer , Integer > map = new HashMap<>();
         maxiLevel(root , 1 , map);
         int maxSum = Integer.MIN_VALUE;
        int minLevel = 1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int level = e.getKey();
            int sum = e.getValue();
            // checking for both the condition 
            if (sum > maxSum || (sum == maxSum && level < minLevel)) {
                maxSum = sum;
                minLevel = level;
            }
        }

        return minLevel;
    }

    public static void maxiLevel(TreeNode root , int level , HashMap< Integer , Integer > map ) 
    {

        if( root == null) return ;

        // storing sum in hashmap corresponding to its level
        map.put(level , map.getOrDefault(level , 0) + root.val);

        // left call
        maxiLevel(root.left , level+1 , map );
        // right call 
        maxiLevel(root.right , level+1 , map);


    }
}