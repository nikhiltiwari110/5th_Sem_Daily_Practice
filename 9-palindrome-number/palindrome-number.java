class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int a = x;
            int copy = 0;
            while(x!=0){
                int rem = x % 10;
                copy = rem + copy*10;
                x = x / 10;
            }
            if(copy==a){
                return true;
            }else{
                return false;
            }
        }
    }
}