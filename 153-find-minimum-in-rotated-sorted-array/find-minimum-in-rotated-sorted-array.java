class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int min = nums[lo];
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>=nums[lo]){
                min=Math.min(nums[lo],min);
                lo = mid+1;
            }else{
                min = Math.min(nums[mid],min);
                hi = mid-1;
            }
        }
        return min;
    }
}