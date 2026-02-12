class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=n*-1;
            x = 1/x;
        }
        return pow(x,n);
    }
    public double pow(double x, int n){
        if(n == 0){
            return 1;
        }
        double y = pow(x,n/2);
        return n%2==0? y*y : y*y*x;
    }
}