class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set  = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int i = 0; i < nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int len = 0;
                int x = nums[i];
                while(set.contains(x)){
                    set.remove(x);
                    len ++;
                    x ++;
                }
                max = Math.max(max,len);
            }
           
        }
        return max;
    }
}