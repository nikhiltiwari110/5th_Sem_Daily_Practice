class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(nums.length==1){
            return true;
        }
        int d = 0;
        if(nums[0]==0){
            d = d - k;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==1){
                int dist = i - d-1;
                if(dist<k){
                    return false;
                }
                d = i;
            }
        }
        return true;
    }
}