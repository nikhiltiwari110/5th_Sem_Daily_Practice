class Solution {
    public int minimumArea(int[][] grid) {
        int minr = grid.length;
        int minc = grid[0].length;
        int maxr = 0;
        int maxc = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1){
                    minr = Math.min(i,minr);
                    maxr = Math.max(i,maxr);
                    minc = Math.min(j,minc);
                    maxc = Math.max(j,maxc);
                }
            }
        }
        int len = maxc - minc + 1;
        int bre = maxr - minr + 1;
        return len*bre;
    }
}