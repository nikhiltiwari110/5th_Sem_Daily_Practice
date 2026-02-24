class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        for(int [] e : edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int rv = q.poll();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if(rv==destination){
                return true;
            }
            for(int el:map.get(rv)){
                if(!visited.contains(el)){
                    q.add(el);
                }
            }
        }
        return false;

    }
}