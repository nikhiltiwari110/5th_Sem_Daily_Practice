class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n,dp);
    }
    public int rec(int n,int [] dp){
        if(n==0||n==1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int f1 = rec(n-1,dp);
        int f2 = rec(n-2,dp);
        return dp[n] = f1+f2;
    }
}