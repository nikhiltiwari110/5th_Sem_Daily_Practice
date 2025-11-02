class Solution {
    public long maxProduct(int[] nums) {
        long v1 = Integer.MIN_VALUE;
        long v2 = Integer.MIN_VALUE;
        for(int x : nums){
            long val = Math.abs(x);
            if(val>=v1){
                v2 = v1;
                v1 = val;
            }else if(val>v2){
                v2 = val;
            }
        }
        return v1*v2*100000;
    }
}