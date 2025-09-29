class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int row = matrix.length;
     int col = matrix[0].length;
     for(int i = 0; i < matrix.length; i++){
     int lo = 0;
     int hi =  col -1;
     while(lo<=hi){
        int mid = (lo+hi)/2;
        if(matrix[i][mid]==target){
            return true;
        }else if(matrix[i][mid]>target){
            hi = mid - 1;
        }else{
            lo = mid + 1;
        }
     }
     }
     return false;   
    }
}