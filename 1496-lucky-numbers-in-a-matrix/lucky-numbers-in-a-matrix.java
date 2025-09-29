class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        //find minimum in each row
        for(int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            row.add(min);
        }
        //find maximum in each column
         for(int j = 0; j < matrix[0].length; j++){
            int max = 0;
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
            col.add(max);
        }

        //check if element is present in both sets.
        List<Integer> ll = new ArrayList<>();
         for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row.contains(matrix[i][j])&&col.contains(matrix[i][j])){
                    ll.add(matrix[i][j]);
                }
            }
        }
        return ll;

    }
}