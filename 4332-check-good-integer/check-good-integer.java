class Solution {
    public boolean checkGoodInteger(int n) {
    int digitsum = 0;
    int squaresum = 0;
    int x = n;
    while(x>0){
        int rem = x % 10;
        x = x / 10;
        digitsum += rem;
        squaresum += rem*rem;
    }
    if(squaresum-digitsum>=50){
        return true;
    }else{
        return false;
    }
    }
}