import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length ; i++ ) {
            if( i != 0 && nums[i] == nums[i-1] ) continue;

            twoSum( -nums[i] , nums , i+1 , result);
        }

        return result;

        
    }

    public static void twoSum( int target , int arr[] , int left , List<List<Integer>> result  ){

        int right = arr.length-1;

        while (left < right) {
            

            if (arr[left] + arr[right] > target) right--;
            else if (arr[left] + arr[right] < target) left++;
            else {
                // Found a valid pair
                
                result.add(Arrays.asList(-target , arr[left] , arr[right]));

                // Move left and right pointers to skip duplicates
                
                while (left < right && arr[left] == arr[left+1]) left++;
                while (left < right && arr[right] == arr[right-1]) right--;

                left++;
                right--;
            }
        }
    }
}