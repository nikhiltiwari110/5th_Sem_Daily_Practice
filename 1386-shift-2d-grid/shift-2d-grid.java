class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int size = grid.length*grid[0].length;
        k = k % size;
        int m = grid.length;
        int n = grid[0].length;
        int [][] temp = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int idx = i*n + j;
                idx = (idx + k)%size;
                int row = idx/n;
                int col = idx%n;
                temp[row][col] = grid[i][j];
            }
        }
        
        List<List<Integer>> ll = new ArrayList<>();
        for(int row = 0; row < m; row++){
            List<Integer> l = new ArrayList<>();
            for(int col = 0; col < n; col++){
                l.add(temp[row][col]);
            }
            ll.add(l);
        }
        return ll;
    }
}