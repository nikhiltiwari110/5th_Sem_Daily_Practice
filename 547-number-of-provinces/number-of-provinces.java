class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        HashSet<Integer> visited = new HashSet<>();
        int c = 0;
        for(int i = 0 ;i < n; i++){
            if(!visited.contains(i)){
                c++;
        Stack<Integer> q = new Stack<>();
            q.push(i);
            while(!q.isEmpty()){
                //remove
                int t = q.pop();
                //ignore
                if(visited.contains(t)){
                    continue;
                }
                //mark visited
                visited.add(t);
                //self work
                if(visited.size()==n){
                    return c;
                }
                //add nbrs
                for(int j = 0; j < n; j++){
                    if(isConnected[t][j] == 1 && !visited.contains(j)){
                        q.push(j);
                    }
                }
            }
        }
    }
    return c;
    }
}