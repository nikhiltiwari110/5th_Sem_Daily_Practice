class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int [] arr = new int[nums1.length];
        int [] next = new int[nums2.length];// array for storing next greater element for each element in nums2
        Stack<Integer> st = new Stack<>();
        st.push(0);// stack contains the index of the first element as the maximum element
        for (int i = 1; i < nums2.length; i++) {
//            if (nums2[i]>nums2[st.peek()]){
                while (!st.isEmpty() && nums2[i]>nums2[st.peek()]) {
                    next[st.pop()] = nums2[i];
                }
                st.push(i);
            //}
        }
        while (!st.isEmpty()){
            next[st.pop()] = -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < next.length; i++) {
            map.put(nums2[i],next[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
        }
        return arr;   
    }
}