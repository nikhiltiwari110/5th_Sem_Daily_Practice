class Solution {
    public int numIslands(char[][] grid) {
       int m = grid.length;
       int n = grid[0].length;

       boolean [][] arr = new boolean[m][n];
        int c = 0;
       for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(!arr[i][j] && grid[i][j] == '1'){
                check(grid,i,j,arr);
                c++;
            }
        }
       }
        return c;
    }
    public void check(char [][] grid,int r, int c , boolean [][] arr){
        if(r<0 || c < 0 || r == grid.length || c == grid[0].length||grid[r][c]=='0' || arr[r][c]) return;
        arr[r][c] = true;
        check(grid,r+1,c,arr);
        check(grid,r,c+1,arr);
        check(grid,r,c-1,arr);
        check(grid,r-1,c,arr);
        
    }
}