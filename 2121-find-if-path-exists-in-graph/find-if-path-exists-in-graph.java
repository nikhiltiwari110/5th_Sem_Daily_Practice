class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ll.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            ll.get(edges[i][0]).add(edges[i][1]);
            ll.get(edges[i][1]).add(edges[i][0]);
        }
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.add(source);
        while(!st.isEmpty()){
            //remove
            int rv = st.pop();
            //ignore if already viisted
            if(visited.contains(rv)){
                continue;
            }
            //mark visited
            visited.add(rv);
            //self work
            if(rv == destination){
                return true;
            }
            //add nbrs
            for(int el: ll.get(rv)){
                if(!visited.contains(el)){
                st.push(el);
                }
            }
        }
        return false;
    }
}