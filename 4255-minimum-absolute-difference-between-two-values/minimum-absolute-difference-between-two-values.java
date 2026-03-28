class Solution {
    public int minAbsoluteDifference(int[] nums) {
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                set1.add(i);
            }else if(nums[i]==2){
                set2.add(i);
            }
        }
        if(set1.size()==0||set2.size()==0){
            return -1;
        }
        for(int i = 0; i < set1.size();i++){
            for(int j = 0; j < set2.size(); j++ ){
                diff = Math.abs(set1.get(i)-set2.get(j));
                min = Math.min(diff,min);
            }
        }
        return min;
    }
}