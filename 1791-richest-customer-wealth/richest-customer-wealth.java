class Solution {
    public int maximumWealth(int[][] accounts) {
         int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = total(accounts[i]);
            if(max<sum) max = sum;
        }
        return max;
    }
    public static int total(int [] arr){
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }
}