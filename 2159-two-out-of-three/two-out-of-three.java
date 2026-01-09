class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();
        HashSet<Integer> ans3 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        List<Integer> ll = new ArrayList<>();
        for(int x : nums1){
            ans1.add(x);
        }
        for(int x : nums2){
            ans2.add(x);
        }
        for(int x : nums3){
            if((ans1.contains(x)||ans2.contains(x)) && !ans.contains(x)){
                ans.add(x);
                ll.add(x);
            }
            ans3.add(x);
        }
        for(int x : nums1){
            if((ans2.contains(x)||ans3.contains(x)) && !ans.contains(x)){
                ans.add(x);
                ll.add(x);
            }
        }
        for(int x : nums2){
            if((ans1.contains(x)||ans3.contains(x)) && !ans.contains(x)){
                ans.add(x);
                ll.add(x);
            }
        }
        return ll;
    }
}