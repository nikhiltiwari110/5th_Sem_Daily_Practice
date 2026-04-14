class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int n = prices.length;
        for(int i = 1; i < n; i++){
            int p = prices[i]-prices[i-1];
            if(p>0){
                maxprofit += p;
            }
        }
        return maxprofit;
    }
}