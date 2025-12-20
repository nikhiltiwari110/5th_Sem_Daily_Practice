class Solution {
    public int findLHS(int[] nums) {
        //maintain Hashmap to store frequnency of all elements
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]+1)){
                int l = map.get(nums[i])+map.get(nums[i]+1);
                len = Math.max(l,len);
            }
        }
        return len;
    }
}