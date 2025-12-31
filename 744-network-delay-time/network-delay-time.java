class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] e : times){
            graph.get(e[0] - 1).add(new Pair(e[1]-1,e[2]));
        }
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (x, y) -> x.cost - y.cost
        );
        pq.offer(new Pair(k-1,0));
        
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            if(visited.contains(p.a)){
                continue;
            }
            visited.add(p.a);
            if(visited.size() == n){
                return p.cost;
            }
            for(Pair pp : graph.get(p.a)){
                if(!visited.contains(pp.a)){
                    pq.offer(new Pair(pp.a,pp.cost+p.cost));
                }
            }
        }
        return -1;
    }
    public class Pair {
        int a;
        int cost;
        public Pair(int x,int y){
            a = x;
            cost = y;
        }
    }
}