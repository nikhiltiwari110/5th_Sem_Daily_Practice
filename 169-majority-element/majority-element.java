class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int c = 1;
        for(int i = 1; i < nums.length; i ++){
            int x = nums[i];
            if(x!=m){
                c--;
                if(c==0){
                    m = x;
                    c = 1;
                }
            }else{
                c++;
            }
        }
        return m;
    }
}