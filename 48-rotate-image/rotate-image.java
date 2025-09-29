class Solution {
    public void rotate(int[][] matrix) {
     //transpose the matrix (swap only the one triangle)
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            if(i<j){
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    //reverse the matrix row wise
    for(int i = 0; i < matrix.length;i++){
        int s = 0;
        int e = matrix[i].length-1;
        while(s<e){
            int temp = matrix[i][s];
            matrix[i][s] = matrix[i][e];
            matrix[i][e] = temp;
            s++;
            e--;
        }
    }
    }
}