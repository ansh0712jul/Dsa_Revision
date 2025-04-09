package Binary_Search;

public class kth_smallest_product {

    public static void main(String[] args) {

        int nums1[] = {-4,-2,0,3};
        int nums2[] = {2,4};
        long k = 6;

        System.out.println(Kth_smallest_Product(nums1 , nums2 , k));
        
    }

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        return  Kth_smallest_Product(nums1 , nums2 , k);
        
    }

    public static long Kth_smallest_Product(int[] nums1, int[] nums2, long k) {

        long lo = -1000_000_0001l;
        long hi = 1000_000_0001l;
        long ans = 0;
        while( lo<= hi) {

            long mid = lo + (hi-lo)/2;
            if(countProducts( nums1 , nums2 , mid) >= k) {
                ans = mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;

    }

    private static long countProducts(int[] nums1, int[] nums2, long dot_pro) {

        long ans = 0;
        for( int e1 : nums1) {
            long count = 0;
            int lo = 0;
            int hi = nums2.length-1;
            if(e1 >= 0){
                while(lo <= hi) {
                    int mid = lo + (hi-lo)/2;
                    if( (long) e1* nums2[mid] <= dot_pro){
                        count = mid +1;
                        lo = mid +1;
                    }
                    else {
                        hi = mid-1;
                    }
                }
                ans = ans + count;
            }

            else {// for negative numbers

                while(lo <= hi) {
                    int mid = lo + (hi-lo)/2;
                    if( (long) e1* nums2[mid] <= dot_pro){
                        count = nums2.length - mid;
                        hi = mid-1;
                        
                    }
                    else {
                        lo = mid +1;
                    }
                }
                ans = ans + count;

            }
        }

        return ans;
        
    }

}