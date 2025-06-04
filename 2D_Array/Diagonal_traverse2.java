import java.util.*;
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        TreeMap< Integer , ArrayList<Integer>> map = new TreeMap<>();

        for(int i=0; i<nums.size(); i++) {
            for(int j=0; j<nums.get(i).size(); j++) {

                int key = i+j;  // diagonal direction is upward 

                map.putIfAbsent(key , new ArrayList<>());
                map.get(key).add(nums.get(i).get(j));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            for(int i=e.getValue().size()-1; i>=0; i--) {
                list.add(e.getValue().get(i));
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

        
    }
}