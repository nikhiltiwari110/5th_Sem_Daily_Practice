class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0){
            return true;
        }
        List<List<Integer>> graph = new ArrayList<>();
        int n = numCourses;
        for(int i = 0 ; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < prerequisites.length; i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        Queue<Integer> q = new LinkedList<>();
        int [] in = new int[n];
        for(int i = 0; i < prerequisites.length;i++){
            in[prerequisites[i][1]]++;
        }
        for(int i = 0; i < n; i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        if(q.isEmpty()){
            return false;
        }
        ArrayList<Integer> ll = new ArrayList<>();
        while(!q.isEmpty()){
            int rv = q.poll();
            if(in[rv]==-1){
                continue;
            }
            in[rv] = -1;
            ll.add(rv);
            for(int el : graph.get(rv)){
                in[el]--;
            }
            for(int i = 0; i < n; i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
        }
        if(ll.size()==n){
            return true;
        }else{
            return false;
        }
    }
}