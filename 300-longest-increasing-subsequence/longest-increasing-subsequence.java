class Solution {
    public int lengthOfLIS(int[] nums) {
     int [] ans = new int[nums.length];
     Arrays.fill(ans,1);
     for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < i; j++){
            if(nums[j]<nums[i]){
                ans[i] = Math.max(ans[i],ans[j]+1);
            }
        }
     }
     int res = 0;
     for(int x : ans){
        if(x>res){
            res =x;
        }
     }
     return res;   
    }
}