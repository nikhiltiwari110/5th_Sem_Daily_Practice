class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for(int x : nums){
            if(x==1) c++;
            else{
                max = Math.max(max,c);
                c = 0;
            }
        }
        return  Math.max(max,c);
    }
}