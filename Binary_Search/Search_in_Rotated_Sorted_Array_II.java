package Binary_Search;

public class Search_in_Rotated_Sorted_Array_II {
    
    public static void main(String[] args) {

        int nums[] = {2,5,6,0,0,1,2};
        int k = 0;

        int index = getPivot(nums);
        int left =  binarySearch(nums , k , 0 , index-1);
        int right = binarySearch(nums , k , index , nums.length-1);

        if(left==-1 && right==-1) System.out.println(false);
        System.out.println(true);
        
    }

    public static int binarySearch(int nums[] , int k,int lo , int hi) {
        while(lo<=hi){

            int mid = lo+(hi-lo)/2;
            if(nums[mid] == k) return mid;

            else if(nums[mid] > k) hi =mid-1;
            else lo = mid+1;

        }

        return -1;
    }

    public static int getPivot(int nums[]){

        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi){

            while(lo<hi && nums[lo] == nums[lo+1]) lo++;
            while(lo<hi && nums[hi] == nums[hi-1]) hi--;
            int mid = lo+(hi-lo)/2;

            if(nums[mid] > nums[hi]) lo=mid+1;
            else hi = mid;
        }

        return lo;
    }
}
