class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     List<List<Integer>> ll = new ArrayList<>();
     for(int i = 0; i < numCourses; i++){
        ll.add(new ArrayList<>());
     }
     int [] ind = new int[numCourses]; 
      for(int [] p : prerequisites){
        int u = p[0];
        int v = p[1];
        ll.get(v).add(u);
        ind[u]++;
     }
     List<Integer> ans = new ArrayList<>();
     Queue<Integer> q = new LinkedList<>();
     for(int i = 0; i < numCourses; i++){
        if(ind[i]==0){
            q.add(i);
        }
     }
     while(!q.isEmpty()){
        int ci = q.poll();
        ans.add(ci);
        for(int el : ll.get(ci)){
            ind[el]--;
            if(ind[el]==0){
                q.add(el);
            }
        }
     }
        if(ans.size()==numCourses) {
            int res[] = new int[ans.size()];
            for(int i = 0; i < ans.size();i++){
                res[i] = ans.get(i);
            }
            return res;
        }   else return new int[0];
    }
}