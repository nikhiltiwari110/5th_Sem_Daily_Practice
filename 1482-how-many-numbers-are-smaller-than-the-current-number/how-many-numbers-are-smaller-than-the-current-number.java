class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];  
        for(int i = 0; i < nums.length; i++){
            ans[i]=find(nums[i],nums);
        }
        return ans;
    }
    public int find(int x, int [] nums){
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<x){
                c++;
            }
        }
        return c;
    }
}