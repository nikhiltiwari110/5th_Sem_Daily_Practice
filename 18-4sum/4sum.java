class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1; j < nums.length;){
                int lo = j+1;
                int hi = nums.length-1;
                while(lo<hi){
                    long sum = (long)nums[i] + nums[j] + nums[lo] + nums[hi];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                        lo++;
                        hi--;
                        while(lo<nums.length && nums[lo]==nums[lo-1]) lo++;
                        while(hi>0 && nums[hi]==nums[hi+1]) hi--;

                    }else if(sum>target){
                        hi--;
                    }else{
                        lo++;
                    }

                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }
        }
        return ans;
    }
}