class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int [] arr = {-1,-1};
        int hi = nums.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid + 1;
            }else if(target<nums[mid]){
                hi = mid - 1;
            }else{
                arr[0] = mid;
                // check for left
                hi = mid -1;
            }
        }
        lo = 0;
        hi = nums.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid + 1;
            }else if(target<nums[mid]){
                hi = mid - 1;
            }else{
                arr[1] = mid;
                // check for right
                lo = mid + 1;
            }
        }
        return arr;
    }
}