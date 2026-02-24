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
        for(int [] q : queries){
            if(dfs(q[0],q[1],graph)){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    public boolean dfs(int s,int d,List<List<Integer>> graph){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        HashSet<Integer> visited = new HashSet<>();
        while(!q.isEmpty()){
            int rv = q.poll();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if(rv==d){
                return true;
            }
            for(int el : graph.get(rv)){
                if(!visited.contains(el)){
                    q.add(el);
                }
            }
        }
        return false;
    }
}