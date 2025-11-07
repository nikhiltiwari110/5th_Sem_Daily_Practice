class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int [nums1.length];
        int j = 0;
        int k = 0;
        int i = 0;
        while(j<m&&k<n){
            int x = nums1[j];
            int y = nums2[k];
            if(x<y){
                arr[i++] = x;
                j++;
            } else{
                arr[i++] = y;
                k++;
            }
        }
        while(j<m) {
            arr[i++] = nums1[j++];
        }
        while(k<n){
            arr[i++] = nums2[k++];
        }
        for(i = 0; i < m+n;i++){
            nums1[i] = arr[i];
        }
    }
}