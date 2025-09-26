class Solution {
    public int firstMissingPositive(int[] nums) {
        //change the value of negative number to nums.length+1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<=0||nums[i]>nums.length+1){
                nums[i] = nums.length+1;
            }
        }
        //we will now check the in range value and product them with -1
        for(int i = 0; i < nums.length; i++){
            int v = Math.abs(nums[i]);
            if(v>0 && v < nums.length+1 && nums[v-1]>0){
                //change the value for that index;
                nums[v-1] = nums[v-1]*-1;
            }
        }

        //now check for the first positive idx
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}