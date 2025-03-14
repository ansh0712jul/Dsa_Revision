package Binary_Search;

public class Minimum_In_Sorted_rotated_Array {
    public static void main(String[] args) {
        
        int nums[] = { 3,4,5,1,2};

        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {

        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if( nums[ mid ] > nums[ hi ] ) lo = mid+1;
            else {   
                hi = mid;
            }
        }

        return nums[lo];
        
    }
}
