class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = nums.length-1; i >= 0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                ll.add(nums[i]);
            }
            if(ll.size()==k){
                break;
            }
        }
        int [] arr = new int [ll.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ll.get(i);
        }
        return arr;
    }
}