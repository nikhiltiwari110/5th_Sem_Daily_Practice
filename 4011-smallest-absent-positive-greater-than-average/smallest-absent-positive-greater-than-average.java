class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int avg = sum/nums.length;
        int el = avg+1;
        Arrays.sort(nums);
        if(el<=0){
            el = 1;
        }
        for(int i = 0; i < nums.length; i++){
            if(el==nums[i]){
                el++;
            }
        }
        return el;
    }
}