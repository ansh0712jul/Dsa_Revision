package binaryTree;

import java.util.*;


//  Use DFS and pass the current depth.

// Use a Map<Integer, Integer> where key = depth, value = max value at that depth.

// At each node, check if the current depth already exists in the map:

// If it doesn't, add it.

// If it does, update it only if the current node's value is greater.

// Finally, collect the values in order of depth.


class Solution {
    public List<Integer> largestValues(TreeNode root) {
        HashMap<Integer , Integer > map = new HashMap<>();
        dfs( root , 0 , map);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) result.add(map.get(i));
        return result;
        
    }

    private void dfs(TreeNode node, int depth, Map<Integer, Integer> map) {
        if (node == null) return;

        if (!map.containsKey(depth)) map.put(depth, node.val);
        else map.put(depth, Math.max(map.get(depth), node.val));

        dfs(node.left, depth + 1, map);
        dfs(node.right, depth + 1, map);
    }
}
