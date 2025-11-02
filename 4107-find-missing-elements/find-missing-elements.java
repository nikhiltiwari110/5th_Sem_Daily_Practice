class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = 101;
        for(int x:nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        int [] arr = new int[max-min+1];
        for(int i = 0 ; i < nums.length; i++){
            arr[nums[i]-min]++;
        }
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                ll.add(i+min);
            }
        }
        return ll;
    }
}