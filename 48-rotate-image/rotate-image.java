class Solution {
    public void rotate(int[][] matrix) {
        //swap the elements abovwe diagonals
        for(int i = 0; i < matrix.length;i++){
            for(int j = i + 1; j < matrix.length; j++){
                //swap
                int el = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = el;
            }
        }
        //reverse column wise
        int n = matrix.length-1;
        for(int j = 0; j  <= n/2; j++){
            for(int i = 0; i <= n;i++){
                //swap
                int el = matrix[i][j];
                matrix[i][j] = matrix[i][n-j];
                matrix[i][n-j] = el;
            }
        }
    }
}