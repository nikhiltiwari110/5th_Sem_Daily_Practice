class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        } 
        int e = 1;
        while(set.contains(e)){
            e++;
        }
        return e;
    }
}