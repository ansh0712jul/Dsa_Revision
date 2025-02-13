package sliding_window;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 6};
        int k = 3;


        int left , right , cnt;
        left = right = cnt = 0;
        int ans = 1;
        while(right<nums.length){

            //growing
            ans = ans*nums[right];

            // shrinking the window 
            while(ans>=k && left<=right){
                ans=ans/nums[left];
                left++;
            }

            //upadting the answer 
            cnt += right-left+1;
            right++;
        }

        System.out.println(cnt); 
    }
}
