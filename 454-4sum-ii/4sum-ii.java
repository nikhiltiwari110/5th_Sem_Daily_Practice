class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int sum1 = nums1[i]+nums2[j];
                if(!map.containsKey(sum1)){
                    map.put(sum1,1);
                }else{
                    map.put(sum1,map.get(sum1)+1);
                }
            }
        }
        int c = 0;
        for(int i = 0; i < nums3.length; i++){
            for(int j = 0; j < nums4.length; j++){
                int sum2 = nums3[i]+nums4[j];
                if(map.containsKey(0-sum2)) 
                c+=map.get(0-sum2);
            }
        }
        return c;
    }
}