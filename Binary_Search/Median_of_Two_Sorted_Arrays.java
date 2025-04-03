package Binary_Search;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,100};
        int arr2[] = { 10,20,30,40,50,60};
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lo = 0 , hi = nums1.length;
        int n = nums1.length , m = nums2.length;

       
        while( lo <= hi){

            int cut1 = (lo+hi)/2;
            int cut2 = ((n+m+1)/2) - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : nums1[cut1];

            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : nums2[cut2];

            if( l1 <= r2 && l2 <= r1){
                return Math.max( l1 , l2) + Math.min( r1 , r2) / 2.0;
            }
            else if(l1 > r2) hi = cut1-1;
            else lo = cut1+1;
        }

        return 0.0;
    }
}
