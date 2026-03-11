class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 1;i<=n; i++){
            map.put(i,new ArrayList<>());
        }
        for(int [] arr : edges){
            int u = arr[0];
            int v = arr[1];
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            q.add(u);
            while(!q.isEmpty()){
                //1.remove
                int rv = q.poll();
                //2. ignore 
                if(visited.contains(rv)) continue;
                //3. mark visited
                visited.add(rv);
                //4.self work
               // if(!map.containsKey(u)) continue;
                //5. add nbrs
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)) q.add(nbrs);
                }
            }
            if(visited.contains(v)){
                return arr;
            }

            map.get(u).add(v);
            map.get(v).add(u);
        }
        return new int[2];
    }
}