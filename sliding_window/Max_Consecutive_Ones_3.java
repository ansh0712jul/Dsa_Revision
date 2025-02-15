package sliding_window;

public class Max_Consecutive_Ones_3 {
    
    public static void main(String[] args) {

        int nums[] = { 1,1,1,0,0,0,1,1,1,1,0 };
        int k = 2;

        System.out.println(longestOnes(nums , k ));
        
    }


    public static int longestOnes(int[] nums, int k) {

        int left , right , flip , ans;
        left = right = flip =  ans =0;

        while(right<nums.length){

            // growing phase 
            if(nums[right] == 0) flip++;


            // shrinking phase 
            while(flip>k && left <= right){
                if(nums[left] == 0) flip--;
                left++;
            }

            // ans calculation 
            ans = Math.max(ans,right-left+1);
            right++;
            
        }

        return ans;
        
    }
}
