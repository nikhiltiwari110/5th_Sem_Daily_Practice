class Solution {
    public int orangesRotting(int[][] grid) {
    int rows = grid.length;
    int col = grid[0].length;
    Queue<int []> q = new LinkedList<>();
    int fresh = 0;
    int minutes = 0;
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < col; j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j});
            }else if(grid[i][j]==1){
                fresh++;
            }
        }
    }
    //define possible directions for infections to spread
    int [] [] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    //continue BFS as long as there are rotten oranges to process and there are still fresh oranges
    while(!q.isEmpty() && fresh>0){
        //get the number of rotten oranges at the current level - current minute
        int size = q.size();
        //process current level
        //process all rotten oranges that became rotten in the previous miniute
        for(int i = 0; i < size; i++){
            //deque the coordinates of the current rotten orange
            int [] cell = q.poll();
            int r = cell[0]; //extract the row index
            int c = cell[1]; //extract the col index
            for(int [] d:dirs){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nc>=0 && nr <rows && nc < col && grid[nr][nc]==1){
                    grid[nr][nc] = 2;
                    q.offer(new int[] {nr,nc});
                    fresh--;
                }
            }
           
        }
         minutes++;
        }
        return fresh== 0?minutes:-1;
    }
}
