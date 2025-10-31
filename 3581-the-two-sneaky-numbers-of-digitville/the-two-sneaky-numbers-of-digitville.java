class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr = new int[2];
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int x : nums){
            if(set.contains(x)&&flag){
                arr[0] = x;
                flag = false;
            }else if(set.contains(x)){
                arr[1] = x;
            }
            set.add(x);
        }
        return arr;
    }
}