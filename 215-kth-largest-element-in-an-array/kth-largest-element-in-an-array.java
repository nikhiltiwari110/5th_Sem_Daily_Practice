class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        //add k elements in queue
        for(int i = 0; i < k; i++){
            p.add(nums[i]);
        }
        //update the k elements with maximum value
        for(int i =k; i < nums.length; i++){
            if(p.peek()<nums[i]){
                p.poll();
                p.add(nums[i]);
            }
        }
        return p.peek();
    }
}