class Solution {
    public int[] twoSum(int[] arr, int target) {

        // As array is already sorted so we can use two pointer for this 

        int left = 0 , right = arr.length-1;

        while(left < right ){
            if(arr[left] + arr[right] > target) right--;
            else if(arr[left] + arr[right] < target) left++;
            else return new int[] {left+1 , right+1};

        }

        return new int []{-1,-1};
        
    }
}