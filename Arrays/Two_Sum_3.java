//  https://www.geeksforgeeks.org/problems/all-distinct-pairs-with-given-sum/1


// since the question asked for the pair of element not index so we can sort it 

import java.util.*;

class Solution {
    public List<List<Integer>> distinctPairs(int[] arr, int target) {
        
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); 

        int left = 0, right = arr.length - 1;

        while (left < right) {
            

            if (arr[left] + arr[right] > target) right--;
            else if (arr[left] + arr[right] < target) left++;
            else {
                // Found a valid pair
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);

                // Move left and right pointers to skip duplicates
                
                while (left < right && arr[left] == arr[left+1]) left++;
                while (left < right && arr[right] == arr[right+1]) right--;

                left++; right--;
            }
        }

        return result;
    }
}
