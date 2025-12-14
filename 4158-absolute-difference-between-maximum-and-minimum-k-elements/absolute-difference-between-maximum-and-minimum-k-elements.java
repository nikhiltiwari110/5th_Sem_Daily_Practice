class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ls = 0;
        int ss = 0;
        for(int i = 0; i < k; i++){
            ls += nums[i];
            ss += nums[nums.length-i-1];
        }
        return Math.abs(ls-ss);
    }
}