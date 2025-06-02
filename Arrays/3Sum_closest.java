import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closestSum = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {

            int l=i+1 , r=nums.length-1;

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if( Math.abs(target - sum) < Math.abs(target - closestSum) ) closestSum = sum;

                else if(sum > target) r--;
                else l++;
            }
        }

        return closestSum;
        
    }
}