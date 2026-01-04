class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        rec(0,nums,target,0);
        return c;
    }   
    public int c = 0;
    public void rec(int amount,int [] nums, int target,int i){
        if(amount == target && i == nums.length){
            c++; 
            return;
        }
         if(i == nums.length){
            return;
        }
        rec(amount+nums[i],nums,target,i+1);
        rec(amount-nums[i],nums,target,i+1);

    }
}