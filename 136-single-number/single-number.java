class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int v:nums){
            x = x ^ v;
        }
        return x;
    }
}