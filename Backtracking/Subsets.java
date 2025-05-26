class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        //  Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        print(nums , 0, ans ,result);
        return result;
        
    }

    public static void print( int nums[] , int index , List<Integer> ans , List<List<Integer>> result) {

        if(index == nums.length){
            if(!result.contains(ans)){
                result.add(new ArrayList<>(ans));
            }
            return ;
        }


        ans.add(nums[index]);
        print(nums , index+1 , ans ,result); //take 

        ans.remove(ans.size()-1);
        print(nums , index+1 , ans ,result); // dont take
    }
}