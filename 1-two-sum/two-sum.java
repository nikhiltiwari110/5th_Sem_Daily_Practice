class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // map.getOrDefault(nums[i],0);
            int x = target - nums[i];
            if(map.containsKey(x)){
                ans[0] = i;
                ans[1] = map.get(x);
            }else {
                map.put(nums[i],i);
            }
        }
        return ans; 
    }
}