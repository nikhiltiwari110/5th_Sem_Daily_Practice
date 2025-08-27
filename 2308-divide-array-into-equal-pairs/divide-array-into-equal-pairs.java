class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int pair = nums.length/2;
        for(int el : nums){
            if(!map.containsKey(el)){
                map.put(el,1);
            }else{
                map.put(el,map.get(el)+1);
            }
        }
        Set<Integer> set = map.keySet();
        int unique = set.size();
        if(unique>pair){
            return false;
        }else{
            for(int el : set){
                if(map.get(el)%2!=0){
                    return false;
                }
            }
        }
        return true;
    }
}