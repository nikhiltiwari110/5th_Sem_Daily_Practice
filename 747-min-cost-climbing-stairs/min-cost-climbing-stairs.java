class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int [cost.length];
        Arrays.fill(dp,-1);
        int zero = rec(cost,0,dp);
        int first = rec(cost,1,dp);
        return Math.min(zero,first);
    }
    public int rec(int [] cost, int i,int [] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one = cost[i] + rec(cost,i+1,dp);
        int two = cost[i] + rec(cost,i+2,dp);
        return dp[i] = Math.min(one,two);
    }
}