class Solution {
    public int maximumGap(int[] nums) {
        int diff = 0;
        if(nums.length<2){
            return diff;
        }
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            int d = nums[i]-nums[i-1];
            diff = Math.max(d,diff);
        }
        return diff;
    }
}