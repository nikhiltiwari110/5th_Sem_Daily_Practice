class Solution {
    public int centeredSubarrays(int[] nums) {
        int c  = 0;
        for(int i = 0; i < nums.length; i++){
            //new HashMap 
            int s = 0;
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                s+= nums[j];
                set.add(nums[j]);
                if(set.contains(s)){
                    c++;
                }
            }
        }
        return c;
    }
}