class Solution {
    public int subsetXORSum(int[] nums) {
        return subset(nums,0,0);
    }
    public int subset(int [] nums, int i, int xor){
        if(i == nums.length){
            return xor;
        }

        //include/pick
        int include = subset(nums,i+1,nums[i]^xor);
        //exclude/notpick
        int exclude = subset(nums,i+1,xor);

        return include + exclude;
    }
}