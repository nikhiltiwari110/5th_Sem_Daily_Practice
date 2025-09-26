class Solution {
    public void sortColors(int[] nums) {
     int c_zero = 0;
     int c_one = 0;
     int c_two = 0;
     for(int i = 0; i < nums.length; i++){
        if(nums[i]==0){
            c_zero++;
        }else if(nums[i]==1){
            c_one++;
        }else{
            c_two++;
        }
     }
     int idx = 0;
     while(c_zero>0){
        nums[idx++] = 0;
        c_zero--;
     }
     while(c_one>0){
        nums[idx++] = 1;
        c_one--;
     }
     while(c_two>0){
        nums[idx++] = 2;
        c_two--;
     }
    }
}