class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        //set row zero
        for(int r : row){
            set_row(matrix,r);
        }
        //set col zero
        for(int c : col){
            set_col(matrix,c);
        }
    }
    public static void set_row(int [][] arr,int row){
        for(int col = 0; col < arr[row].length; col++){
            arr[row][col] = 0;
        }
    }
    public static void set_col(int [][] arr,int col){
        for(int row = 0; row < arr.length; row++){
            arr[row][col] = 0;
        }
    }
}