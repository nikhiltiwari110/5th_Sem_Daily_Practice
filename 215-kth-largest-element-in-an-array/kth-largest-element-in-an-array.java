class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int x : nums){
            pq.offer(x);
        }
        int a = 0;
        for(int i = 1; i <= k; i++){
            a = pq.poll();
        }
        return a;
    }
}