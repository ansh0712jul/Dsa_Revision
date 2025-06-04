import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] nums) {

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int key = i + j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(nums[i][j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Traverse the TreeMap in order of diagonal index

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> diag = entry.getValue();
            // For even diagonals, reverse the order (upward direction)
            if (entry.getKey() % 2 == 0) {
                Collections.reverse(diag);
            }
            list.addAll(diag);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
