class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] p : prerequisites){
            graph.get(p[0]).add(p[1]);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < numCourses;i++){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        HashSet<Integer> visited = new HashSet<>();
        while(!q.isEmpty()){
            int rv = q.poll();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            graph.get(i).add(rv);
            for(int el : graph.get(rv)){
                if(!visited.contains(el)){
                    q.add(el);
                }
            }
        }
        }
        for(int [] q : queries){
            if(graph.get(q[0]).contains(q[1])){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}