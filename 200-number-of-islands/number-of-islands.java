class Solution {
    public int numIslands(char[][] grid) {
    int count = 0;
    for(int i = 0 ; i < grid.length; i++){
        for(int j = 0; j < grid[i].length; j++){
            if(grid[i][j]=='1'){
                count+=1;
                call_rec(grid,i,j);
            }
        }
    }
    return count;   
    }
    public void call_rec(char[][] grid, int i, int j){
        if(i<0 || i >= grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        call_rec(grid,i+1,j);//down
        call_rec(grid,i-1,j);//up
        call_rec(grid,i,j-1);//left
        call_rec(grid,i,j+1);//right
    }
}