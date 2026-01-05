class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][] dp = new int[n+1][m+1];
        for(int [] d : dp){
            Arrays.fill(d,-1);
        }
        return rec(word1,word2,word1.length(),word2.length(),dp);
    }
    public int rec(String word1, String word2, int i, int j,int [][] dp){
        if(i == 0) return j;
        if(j == 0) return i;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i-1) == word2.charAt(j-1)){
            return rec(word1,word2,i - 1, j -1,dp);
        }
        return dp[i][j] = 1 + Math.min(rec(word1,word2,i-1,j-1,dp),Math.min(rec(word1,word2,i,j-1,dp),rec(word1,word2,i-1,j,dp)));
    }
}