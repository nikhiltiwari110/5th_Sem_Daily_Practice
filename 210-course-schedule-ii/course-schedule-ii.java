class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;//n =2
        int [] ans = new int[n]; //
        int id = 0;
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int [] e : prerequisites){
            graph.get(e[1]).add(e[0]);
        }

        int [] in = new int[n];
        for(int [] e : prerequisites){
            in[e[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n;i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        if(q.isEmpty()){
            return new int[0];
        }
        while(!q.isEmpty()){
            //remove
            int r = q.poll();
            //ignore
            if(in[r]==-1){
                continue;
            }
            //mark visited
            ans1.add(r);
            in[r] = -1;
            //self work 
            ans[id++] = r;
            //decrese neighbours indegree
            for(int el : graph.get(r)){
                in[el]--;
            }
            for(int i = 0; i < n; i++){
                if(in[i]==0){
                    q.add(i);
                }
            }
        }
        if(ans1.size()==n){
            return ans;        
        }else{
            return new int [0];
        }

    }
}