package sliding_window;

public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {

        int nums[] = { 1,0,1,0,1 };
        int k = 2;

        System.out.println( sumLesserThanOrEqaul(nums,k) - sumLesserThanOrEqaul(nums,k-1));
        
    }

    public static int sumLesserThanOrEqaul(int nums[] , int k){

        int left , right , cnt;
        left = right = cnt = 0;
        int sum = 0;

        while(right < nums.length){
            
            // growing phase of window 
            sum += nums[right];

            while(sum>k && left<=right){

                // shrinking phase of window when size of map greater than k 
                sum -= nums[left];
                left++;
            }
            
            // ans updation
            cnt = cnt + right-left+1;
            right++;
        }
        return cnt ;
    }
}
