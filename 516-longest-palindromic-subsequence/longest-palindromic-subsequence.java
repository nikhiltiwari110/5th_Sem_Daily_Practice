class Solution {
    public int longestPalindromeSubseq(String s) {
        String r = reverse(s);
        int [][] dp = new int[s.length()+1][r.length()+1];
        for(int i = 0; i < s.length(); i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < r.length(); j++){
            dp[0][j] = 0;
        }
        for(int i = 0; i < s.length();i++){
            for(int j = 0; j < r.length(); j++){
                if(s.charAt(i)==r.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[s.length()][r.length()];
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i = s.length()-1; i >= 0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}