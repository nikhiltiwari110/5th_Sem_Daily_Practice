class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        if(prerequisites.length == 0){
            return true;
        }
        int [] in = new int[n];
        for(int [] e : prerequisites){
            in[e[0]]++;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] e: prerequisites){
            // ll.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        if(q.isEmpty()){
            return false;
        }
        List<Integer> a = new ArrayList<>();
        while(!q.isEmpty()){
            //remove;
            int rv = q.poll();
            //ignore
            if(in[rv]<0){
                continue;
            }
            a.add(rv);
            in[rv] = -1;
            for(int el : graph.get(rv)){
                in[el]--;
            }
            for(int i = 0 ; i < n; i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
        }
        if(a.size()==n){
            return true;
        }else{
            return false;
        }
    }
}