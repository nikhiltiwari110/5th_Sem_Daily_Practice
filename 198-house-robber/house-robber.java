class Solution {
    public int res;
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(0,nums,dp);
    }
    public int rec(int index,int [] nums,int [] dp){
        if(index>=nums.length){
            return res;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        //pick
        int sum2=0, sum1=0;
        sum1 += nums[index] + rec(index+2,nums,dp);
        //unpick
        sum2 += rec(index+1,nums,dp);
        return dp[index] = Math.max(sum1,sum2);
    }
}