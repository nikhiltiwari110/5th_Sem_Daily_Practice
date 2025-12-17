class Solution {
    public void rotate(int[][] matrix) {
        //first we have to transpose the matrix then reverse by columns

        //1. transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length; j++){
                if(j>i){
                    //swap
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        //2. reverse each row 
        for(int row = 0; row<matrix.length;row++){
            //swap
            int st = 0;
            int ed = matrix[row].length-1;
            while(st<ed){
                int t = matrix[row][st];
                matrix[row][st] = matrix[row][ed];
                matrix[row][ed] = t;
                st++;
                ed--;
            }
        }
    }
}