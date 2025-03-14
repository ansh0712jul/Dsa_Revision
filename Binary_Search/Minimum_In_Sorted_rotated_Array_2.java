package Binary_Search;

public class Minimum_In_Sorted_rotated_Array_2 {

    public static void main(String[] args) {

        int nums [] = {2,2,2,0,1};
        System.out.println(findMin(nums));
        
    }

    public static  int findMin(int[] nums) {

        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi){
            // ingoring repeating values 
            while(lo<hi && nums[lo] == nums[lo+1]) lo++; 
            while(lo<hi && nums[hi] == nums[hi-1]) hi--; 
            int mid = lo + (hi - lo)/2;

            if(nums[mid] > nums[hi]) lo = mid+1;
            else hi = mid;

        }
        return nums[lo];
        
    }
    
}
