package sliding_window;

public class Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {

        int nums[] = { 2,2,2,1,2,2,1,2,2,2 };
        int k = 2;

        System.out.println(atMostK(nums,k) - atMostK(nums,k-1));
        
    }

    public static int atMostK(int nums[] , int k) {

        int left , right , cnt , odd;
        left = right = cnt = odd = 0;

        while(right<nums.length){

            if(nums[right]%2==1) odd++;

            while(odd > k && left <= right){

                if(nums[left]%2==1){
                    odd--;
                }
                left++;
            }

            cnt+=right-left+1;
            right++;

        }
        return cnt ;
    }
}
