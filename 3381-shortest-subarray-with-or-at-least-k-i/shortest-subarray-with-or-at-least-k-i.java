class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int len = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int x = 0;
            for(int j = i; j < nums.length; j++){
                x = x | nums[j];
            if(x>=k){
                int l = j - i + 1;
                len = Math.min(l,len);
                }
            }
        }
        if(len==Integer.MAX_VALUE){
            return -1;
        }else{
            return len;
        }
    }
}