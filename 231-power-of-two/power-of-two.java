class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        while(n>0){
            if(flag){
                return false;
            }
            int rem = n % 2;
            if(rem==1){
                flag = true;
            }
            n = n >> 1; // right shift
            //System.out.println(n);
        }
        return flag;
    }
}