class Solution {
    public int maxProfit(int[] prices) {
     int maxprofit = 0;
     int n = prices.length;
     int max = prices[n-1];
     int [] maxsuffix = new int[n];
     for(int i = n-1; i >=0; i--){
        maxsuffix[i] = Math.max(prices[i],max);
        max = Math.max(prices[i],max);
     }
     int profit = 0;
     for(int i = 0; i < n; i++){
        profit = maxsuffix[i]-prices[i];
        maxprofit = Math.max(maxprofit,profit);
     }
     return maxprofit;    
    }
}