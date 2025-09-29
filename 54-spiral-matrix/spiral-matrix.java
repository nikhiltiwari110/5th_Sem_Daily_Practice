class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int min_r = 0;
        int min_c = 0;
        int max_r = matrix.length-1;
        int max_c = matrix[0].length-1;
        List<Integer> ll = new ArrayList<>();
        int total = matrix.length*matrix[0].length;
        while(ll.size()<total){
            //min_c to max_c
            for(int j = min_c; j<= max_c && ll.size()<total; j++){
                ll.add(matrix[min_r][j]);
            }
            min_r++;

            //min_r to max_r
            for(int i = min_r; i <= max_r && ll.size()<total; i++){
                ll.add(matrix[i][max_c]);
            }
            max_c--;

            //max_c to min_c
            for(int j = max_c; j>= min_c && ll.size()<total; j--){
                ll.add(matrix[max_r][j]);
            }
            max_r--;

            //max_r to min_r
            for(int i = max_r; i>= min_r && ll.size()<total;i--){
                ll.add(matrix[i][min_c]);
            }
            min_c++;
        }
        return ll;
    }
}