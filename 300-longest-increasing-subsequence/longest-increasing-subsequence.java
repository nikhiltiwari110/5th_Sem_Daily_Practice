class Solution {
    public int lengthOfLIS(int[] arr) {
         int [] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if (arr[i]>arr[j]){
                    int x = dp[j];
                    dp[i] = Math.max(dp[i], x + 1);
                }
            }
        }
        int max = 1;
        for(int k = 0; k < dp.length; k++){
            max = Math.max(max,dp[k]);
        }
        return max;
        //return Arrays.stream(dp).max().getAsInt();
    }
}
