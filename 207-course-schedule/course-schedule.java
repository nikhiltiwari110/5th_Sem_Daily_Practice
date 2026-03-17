class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            ll.add(new ArrayList<>());
        }
        int [] in = new int[numCourses];
        for(int []p : prerequisites){
            int u = p[0];
            int v = p[1];
            in[u]++;
            ll.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int c = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            c++;
            for(int el:ll.get(current)){
                in[el]--;
                if(in[el]==0){
                    q.add(el);
                }
            }
        }
        return c == numCourses;
    }
}