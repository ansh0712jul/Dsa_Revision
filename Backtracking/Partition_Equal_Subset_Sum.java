

public class Partition_Equal_Subset_Sum {

    public static void main(String[] args) {

        int nums [] = {1,5,11,5};

        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) System.out.println(false);

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        boolean ans =  canPartitionHelper(nums, 0, target, dp);

        System.out.println(ans);
        
    }

    public static boolean canPartitionHelper(int[] nums, int index, int sum, Boolean[][] dp) {
        if (sum == 0) return true;
        if (index >= nums.length || sum < 0) return false;

        if (dp[index][sum] != null) return dp[index][sum];

        // include current element or exclude
        boolean include = canPartitionHelper(nums, index + 1, sum - nums[index], dp);
        boolean exclude = canPartitionHelper(nums, index + 1, sum, dp);

        return dp[index][sum] = include || exclude;
    }
    
}
