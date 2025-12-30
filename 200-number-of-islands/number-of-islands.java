class Solution {
    public int numIslands(char[][] grid) {
        int c = 0;
        int [][] visited = new int [grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(visited[i][j]!=1 && grid[i][j] == '1'){
                    // visited[i][j] = 1;
                    dfs(i,j,grid,visited);
                    c++;
                }
            }
        }
        return c;   
    }
    public void dfs(int r,int c,char [][] grid, int [][] visited){
        if(r<0 || c<0 || r>=grid.length || c >= grid[0].length || visited[r][c] == 1 || grid[r][c] == '0'){
            return;
        }
        visited[r][c] = 1;
        //up
        dfs(r-1,c,grid,visited);
        //down
        dfs(r+1,c,grid,visited);
        //left
        dfs(r,c-1,grid,visited);
        //right
        dfs(r,c+1,grid,visited);
    }
}