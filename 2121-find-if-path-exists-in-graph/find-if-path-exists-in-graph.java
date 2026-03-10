class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] e : edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int r = q.poll();
            if(visited.contains(r)) continue;
            visited.add(r);
            if(r == destination) return true;
            for(int el : graph.get(r)){
                if(!visited.contains(el)) q.add(el);
            }
        }
        return false;

    }
}