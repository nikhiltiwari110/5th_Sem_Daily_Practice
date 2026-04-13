class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int f1 = Integer.MAX_VALUE;
        for(int i = start; i < nums.length;i++){
            if(nums[i]==target){
                int d = Math.abs(start-i);
                f1 = Math.min(f1,d);
            }
        }
        for(int i = start; i >= 0;i--){
            if(nums[i]==target){
                int d = Math.abs(start-i);
                f1 = Math.min(f1,d);
            }
        }
        return f1;
    }
}