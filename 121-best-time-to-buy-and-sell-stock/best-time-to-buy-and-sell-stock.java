class Solution {
    public int maxProfit(int[] prices) {
        int [] suffix = new int[prices.length];
        int max = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--){
            if(prices[i]>max){
                max = prices[i];
                suffix[i] = -1;
            }else{
                suffix[i] = max;
            }
        }
        //find profit for all elements;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(suffix[i]!=-1){
                int dif = suffix[i] - prices[i];
                profit = Math.max(dif,profit);
            }
        }
        return profit;
    }
}