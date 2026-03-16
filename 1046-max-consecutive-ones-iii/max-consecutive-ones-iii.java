class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int co = 0;
        int cz = 0;
        int si = 0;
        int ei = 0;
        while(ei<nums.length){
            
            if(nums[ei]==1) co++;
            else{
                cz++;
            }
            while(cz>k){
                if(nums[si]==0){
                    cz--;
                }
                si++;
            }
            int len = ei - si + 1;
            max = Math.max(max,len);
            ei++;
        }
        return max;
    }
}