class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int [] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        rec(amount,coins,dp);
        dp[0] = 0;
        if(dp[amount] == Integer.MAX_VALUE ) return -1;
        else
        return dp[amount];
    }
    public int rec (int amount, int [] coins, int [] dp){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1) return dp[amount];
        int min = Integer.MAX_VALUE;
        for(int x : coins){
            int y = rec(amount-x,coins,dp);
            if(y!=Integer.MAX_VALUE);{
                min = Math.min(y,min);
            }
        }
        if(min!=Integer.MAX_VALUE)
        return dp[amount] = min+1;
        else return dp[amount] = Integer.MAX_VALUE;
    }
}