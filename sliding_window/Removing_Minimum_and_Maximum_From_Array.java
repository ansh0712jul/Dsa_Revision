package sliding_window;

public class Removing_Minimum_and_Maximum_From_Array {
    
    public static void main(String[] args) {
        
        int nums[] =   {2,10,7,5,4,1,8,6}; 
    }

    public static int minimumDeletions(int[] nums) {
        int n = nums.length;

        // calculating min and max index 
        int min , max;
        min = max = 0;

        for(int i=1; i<n; i++ ){
            if(nums[i] > nums[max]) max=i;
            if(nums[i] < nums[min]) min = i;
        }

        // calculating from left 
        int left = Math.max(max,min)+1;

        // from right 
        int right = n - Math.min(max,min);

        // from both side 

        int left_right =  Math.min(max,min)+1 +(n -  Math.max(max,min));

        return Math.min( left_right , Math.min(right , left ));
        
    }
}
