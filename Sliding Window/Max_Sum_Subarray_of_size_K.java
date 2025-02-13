public class Max_Sum_Subarray_of_size_K {

    public static void main(String[] args) {
        
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(findMaxSumSubArray(k, arr));
    }

    public static int findMaxSumSubArray(int k, int[] arr) {

        int ans , sum = 0;

        // calculate the sum of first k sized fixed window 
        for(int i = 0; i < k; i++) sum += arr[i];

        // initialize the ans with sum
        ans = sum;

        // adding new element and removing the first element of the window

        for(int i = k; i < arr.length; i++) sum = sum - arr[i-k] + arr[i];
        return ans;
    }
}