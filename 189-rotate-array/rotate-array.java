class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
    }
    public void reverse(int start , int end, int [] nums){
        while(start<end){
            int r = nums[start];
            nums[start] = nums[end];
            nums[end] = r;
            start++;
            end--;
        }
    }
}