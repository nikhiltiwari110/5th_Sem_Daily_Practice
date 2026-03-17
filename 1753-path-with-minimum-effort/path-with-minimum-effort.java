class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int [][] effort = new int[m][n];
        //fill all the cells with max possible value
        for(int []e:effort){
            Arrays.fill(e,Integer.MAX_VALUE);  
        }
        //starting cell effort is 0;
        effort[0][0] = 0;
        //Min Heap - (to store row,col,current effort)
        PriorityQueue<int []> pq = new PriorityQueue<>(
            (a,b) -> a[2] - b[2]
            //sort by effort (minimum at top)
        );
        pq.offer(new int[] {0,0,0});
        int [][] dire = {{1,0},{-1,0},{0,1},{0,-1}}; //dir arr to move in 4 dir.
        while(!pq.isEmpty()){
            //extract the cell with minimum effort
            int [] current = pq.poll();
            int r = current[0];
            int c = current[1];
            int currentEffort = current[2];
            //if we reach the destination , return current effort
            if(r == m-1 && c == n-1){
                return currentEffort;
            }
            //if we already found a better path earlier, skip
            if(currentEffort> effort[r][c]){
                continue;
            }
            //explore all 4 directions
            for(int [] dir : dire){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr>= 0 && nc >= 0 && nr < m && nc < n){
                    //calculate edge cost - abs difference
                    int edgeCost = Math.abs(heights[nr][nc]-heights[r][c]);
                    //new effort = maximum of current effort and this edge
                    int newEffort = Math.max(currentEffort,edgeCost);
                    //if this path gives a smaller effort, update
                    if(newEffort < effort[nr][nc]){
                        effort[nr][nc] = newEffort;
                        pq.offer(new int[]{nr,nc,newEffort});
                    }
                }
            }
        }
        return 0;
    }
}