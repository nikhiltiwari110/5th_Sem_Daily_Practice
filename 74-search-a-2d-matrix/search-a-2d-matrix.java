class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int m = matrix.length; //row
        int n = matrix[0].length; //col
        int hi = n*m - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int i = mid/n;
            int j = mid%n;
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return false;
    }
}