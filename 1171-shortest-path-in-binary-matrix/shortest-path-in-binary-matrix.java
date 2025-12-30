class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }
        Queue<Pair> q = new LinkedList<>();
        boolean [][] visited = new boolean [n][n];
        q.add(new Pair(0,0,1));
        while(!q.isEmpty()){
            //remove
            Pair pq = q.poll();
            //ignore
            if(visited[pq.u][pq.v]){
                continue;
            }
            //mark visited
            visited[pq.u][pq.v] = true;
            //self work
            if(pq.u == n-1 && pq.v == n-1){
                return pq.cost;
            }
            //add nbrs
            for(int i = -1; i <= 1; i++){
                for(int j = -1; j <= 1; j++){
                    int x = pq.u + i;
                    int y = pq.v + j;
                    if(x<0 || y < 0 || x >= n || y >= n || visited[x][y] == true || grid[x][y] == 1){
                        continue;
                    }
                    else q.add(new Pair(x,y,pq.cost+1));
                }
            }
        }
        return -1;
    }
    public class Pair{
        int u;
        int v;
        int cost;
        public Pair(int a,int b,int c){
            u = a;
            v = b;
            cost = c;
        }
    }
}