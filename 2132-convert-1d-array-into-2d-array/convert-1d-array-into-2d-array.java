class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int idx = 0;
        int [][] matrix = new int[m][n];
        if(original.length!=n*m){
            return new int[0][0];
        }
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = original[idx++];
                }
            }
        }
        return matrix;
    }
}