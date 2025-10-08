class Solution {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        for(int el : nums){
            result = result | el;
        }
        return result << nums.length-1;
    }
}