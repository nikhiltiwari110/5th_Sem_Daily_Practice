class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int si = 0;
        int ei = 0;
        int sum = 0;
        while(ei<nums.length){
            sum += nums[ei];
            while(sum>=target){
                min = Math.min(min,ei-si+1);
                sum -= nums[si];
                si++;
            }
            ei++;

        } 
        if(min==Integer.MAX_VALUE) return 0;
        else
         return min;  
    }
}