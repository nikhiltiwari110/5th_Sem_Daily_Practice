class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int min_moves = Integer.MAX_VALUE;
        int s = 0;
        int e = 0;
        while(e<n){
           while(nums[e]>(long)nums[s]*k){
            s++;
           }
           moves = n - (e - s + 1);
           min_moves = Math.min(moves,min_moves);
           e++;
        }
        return min_moves;
    }
}