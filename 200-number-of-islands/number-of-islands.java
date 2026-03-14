class Solution {
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int c = 0;
        boolean [][] valid = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j]=='1'&&valid[i][j]==false){
                    // valid[i][j] = true;
                    makeit(grid,valid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void makeit(char[][] grid,boolean [][] valid, int r, int c){
        if(r<0||r>=grid.length || c<0 || c >= grid[0].length || grid[r][c]=='0' || valid[r][c]){
            return;
        }
       valid[r][c] = true; 
       int []rows = {1,-1,0,0};
       int []col = {0,0,1,-1};
       for(int i = 0; i < 4; i ++){
        makeit(grid,valid,r+rows[i],c+col[i]);
       } 
        // makeit(grid,valid,r+1,c);
        // makeit(grid,valid,r-1,c);
        // makeit(grid,valid,r,c+1);
        // makeit(grid,valid,r,c-1);

    }
}