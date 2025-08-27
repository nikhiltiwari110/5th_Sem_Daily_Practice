class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el : nums){
            if(map.containsKey(el)){
                map.put(el,map.get(el)+1);
            }else{
                map.put(el,1);
            }
        }
        int sum = 0;
        for(int var : map.keySet()){
            if(map.get(var)==1){
                sum+=var;
            }
        }
        return sum;
    }
}