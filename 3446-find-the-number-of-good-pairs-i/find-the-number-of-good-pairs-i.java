class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c = 0;
        for(int j = 0; j < nums2.length; j++){
            for(int i = 0; i < nums1.length; i++){
                if(nums1[i]%(nums2[j]*k)==0){
                    c++;
                }
            }
        }
        return c;
    }
}