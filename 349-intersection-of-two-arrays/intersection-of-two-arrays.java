class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
           return fun(nums2,nums1);
        }else{
           return fun(nums1,nums2);
        }
    }
    public int[] fun(int [] nums1, int [] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x : nums2){
            set1.add(x);
        }
        for(int x : nums1){
            if(set1.contains(x)){
                set2.add(x);
            }
        }
        int [] res = new int [set2.size()];
        int idx = 0;
        for(int x : set2){
            res[idx++] = x;
        }
        return res;
    }
}