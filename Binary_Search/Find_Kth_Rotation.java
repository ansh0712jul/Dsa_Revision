package Binary_Search;

public class Find_Kth_Rotation {
    public static void main(String[] args) {
        
        int nums[] = {6, 9, 2, 4};

        System.out.println(findKRotation(nums));
    }

    public static  int findKRotation(int[] arr) {
        
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid] > arr[hi]) lo = mid+1;
            else hi = mid;
        }
        
        return lo;
        
    }
}
