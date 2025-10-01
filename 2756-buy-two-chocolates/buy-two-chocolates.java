class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int x = prices[0];
        int y = prices[1];
        if(money-x-y>=0){
            return money-x-y;
        }else{
            return money;
        }
    }
}