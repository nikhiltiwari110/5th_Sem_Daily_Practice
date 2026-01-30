class Solution {
    public int jump(int[] nums) {
        int maxjump = 0;
        int count = 0;
        int endjump = 0;
        for(int i = 0; i < nums.length-1; i++){
            maxjump = Math.max(maxjump,i+nums[i]);
            if(i == endjump){
                count++;
                endjump = maxjump; 
            }
        }
        return count;
    }
}