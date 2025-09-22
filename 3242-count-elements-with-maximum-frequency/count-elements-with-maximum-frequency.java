class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el: nums){
            map.put(el, map.getOrDefault(el, 0)+1);
        }
        int max = 0;
        for(int m : map.keySet()){
            // if(map.get(m)>max){
            //     max = map.get(m);
            // }
            max = map.get(m) > max ? map.get(m) : max;
        }
        int ans = 0;
        for(int m : map.keySet()){
            if(map.get(m)==max){
                ans+= max;
            }
        }
        return ans; 
    }
}