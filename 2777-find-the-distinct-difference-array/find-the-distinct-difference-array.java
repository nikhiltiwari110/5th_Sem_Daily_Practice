class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int [] p = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
                set.add(nums[i]);
                p[i] = set.size();
        }
        HashSet<Integer> set2 = new HashSet<>();
        int [] s = new int [nums.length];
        for(int i = nums.length-1; i >= 0; i--){
                set2.add(nums[i]);
                s[i] = set2.size();
        }
        for(int i = 0; i < nums.length-1; i++){
            s[i] = s[i+1];
        }
        s[nums.length-1] = 0;
        for(int i = 0;i < nums.length; i++){
            nums[i] = p[i] - s[i];
        }
        return nums;
    }
}