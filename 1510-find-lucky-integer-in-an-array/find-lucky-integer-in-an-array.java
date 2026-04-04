class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = -1;
        for(int k : map.keySet()){
            int f = map.get(k);
            if(k==f){
                if(k>max){
                    max = k;
                }
            }
        }
        return max;
    }
}