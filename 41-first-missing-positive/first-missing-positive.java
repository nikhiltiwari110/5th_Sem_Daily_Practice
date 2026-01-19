class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}