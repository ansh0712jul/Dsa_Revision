package Binary_Search;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

        int nums []= { 4,5,6,7,0,1,2 };
        int k = 0;

        int index = getPivot(nums);
        int left =  binarySearch(nums , k , 0 , index-1);
        int right = binarySearch(nums , k , index , nums.length-1);

        if(left==-1 && right==-1) System.out.println(-1);
        if(left != -1) System.out.println(left) ; 
        System.out.println(right);
        
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

    // method to get index from where the array has been rotated 
    public static int getPivot(int nums[]){

        int lo = 0;
        int hi = nums.length-1;

        while(lo<hi){
            int mid = lo+(hi-lo)/2;

            if(nums[mid] > nums[hi]) lo=mid+1;
            else hi = mid;
        }

        return lo;
    }
}
