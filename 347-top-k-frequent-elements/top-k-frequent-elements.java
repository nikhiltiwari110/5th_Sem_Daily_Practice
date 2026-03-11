class Solution {

    class Pair{
        int el;
        int freq;
        Pair(int el,int freq){
            this.freq = freq;
            this.el = el;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int [] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> b.freq-a.freq);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int key : map.keySet()){
            Pair p = new Pair(key,map.get(key));
            pq.add(p);
        }
        for(int i = 0; i < k; i++){
            Pair r = pq.poll();
            ans[i] = r.el;
        }
        return ans;
    }
}