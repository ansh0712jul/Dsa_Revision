package Binary_Search;

public class Find_the_Smallest_divisor_Given_a_Threshold {
    
    public static void main(String[] args) {

        int nums []  = {44,22,33,11,1};
        int threshold = 5;

        System.out.println(binarySearch(nums , threshold));
        
    }

    public static int binarySearch(int nums[] , int threshold){
        int ans=0;
        int hi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) hi=Math.max(hi, nums[i]);
        int lo = 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid , nums , threshold)) {
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }

    public static boolean isPossible(int mid , int arr[] , int threshold){
        int ans=0;
        for(int i=0;i<arr.length;i++) ans+=Math.ceil((double)(arr[i])/ (double)(mid));
        return ans <= threshold;
    } 


}
