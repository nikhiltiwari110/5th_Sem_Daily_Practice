class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int [] newans = new int[2*n];
        for(int i = 0; i < n; i++){
            newans[i] = nums[i];
        }
        int j = n-1;
        for(int i = n; i < 2*n; i++){
            newans[i] = nums[j];
            j--;
        }
        return newans;
    }
}