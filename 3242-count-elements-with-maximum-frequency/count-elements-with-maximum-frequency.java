class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //find freq
        for(int el : nums){
            if(map.containsKey(el)){
                map.put(el,map.get(el)+1);
            }else{
                map.put(el,1);
            }
        }
        //find max freq
        int max = Integer.MIN_VALUE;
        for(int el : map.keySet()){
            if(map.get(el)>max){
                max = map.get(el);
            }
        }
        //find elements with max freq
        int total = 0;
        for(int el : map.keySet()){
            if(map.get(el)==max){
                total+=map.get(el);
            }
        }
        return total;
    }
}