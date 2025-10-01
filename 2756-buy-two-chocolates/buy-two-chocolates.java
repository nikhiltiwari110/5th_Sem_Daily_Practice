class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int x : prices){
            if(x<min1){
                min2 = min1;
                min1 = x;
            }else if(x<min2){
                min2 = x;
            }
        }
        if(money-min1-min2>=0){
            return money-min1-min2;
        }else{
            return money;
        }
    }
}