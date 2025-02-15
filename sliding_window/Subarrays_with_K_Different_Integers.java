package sliding_window;

import java.util.HashMap;

public class Subarrays_with_K_Different_Integers {
    
    public static void main(String[] args) {
        int nums[] = { 1,2,1,2,3 };
        int k =2;

        System.out.println( atMostKDsitinct(nums,k) - atMostKDsitinct(nums,k-1));
    }

    public static int atMostKDsitinct(int nums[] , int k){

        int left , right , cnt;
        left = right = cnt = 0;
        HashMap< Integer , Integer > map = new HashMap<>();

        while(right < nums.length){
            
            // growing phase of window 
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k && left<=right){

                // shrinking phase of window when size of map greater than k 
                int freq = map.get(nums[left]);
                if(freq == 1) map.remove(nums[left]);
                else map.put(nums[left], freq-1);
                left++;
            }
            
            // ans updation 
            cnt = cnt + right-left+1;
            right++;
        }
        return cnt ;
    }
}


// the logic behind the problem 

// no of subarrya with exactly K unique elements =  atmost k elemnt - atmost k-1 element 