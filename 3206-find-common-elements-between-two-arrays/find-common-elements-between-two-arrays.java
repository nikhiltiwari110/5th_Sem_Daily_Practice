class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> ans1 = new HashSet<>();
        int c1 = 0;
        for(int x:nums1){
            ans1.add(x);
        }
        HashSet<Integer> ans2 = new HashSet<>();
        int c2 = 0;
        for(int x : nums2){
            if(ans1.contains(x)){
                c2++;
            }
            ans2.add(x);
        }
        for(int x: nums1){
            if(ans2.contains(x)){
                c1++;
            }
        }
        int [] ans = {c1,c2};
        return ans;
    }
}