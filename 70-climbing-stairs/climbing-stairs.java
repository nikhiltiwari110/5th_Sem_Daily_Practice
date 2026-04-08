class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int [] dp = new int[4];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i <= n; i++){
            dp[3] = dp[1] + dp[2];
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
}