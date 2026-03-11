class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 0;
        int len = 1;
        int x = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==x+1){
                x = nums[i];
                len++;
            }else if(nums[i] == x){
                continue;
            }else{
                x = nums[i];
                max = Math.max(max,len);
                len = 1;
            }
        }
        return Math.max(max,len);

    }
}