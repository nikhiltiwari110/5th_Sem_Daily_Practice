class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//Min Heap
        for(int i = 0; i < k; i++){
            pq.offer(nums[i]); // add k elements
        }
        //as it is min heap top element is the smallest 
        for(int i = k; i < nums.length; i++){
            int x = nums[i];
            if(x>pq.peek()){
                pq.poll();
                pq.offer(x);
            }
        }
        return pq.peek();
    }
}