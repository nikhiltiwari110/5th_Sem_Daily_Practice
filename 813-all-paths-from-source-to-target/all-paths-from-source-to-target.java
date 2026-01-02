class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,new ArrayList<>(),graph,res);
        return res;
    }
    public void dfs(int index,List<Integer> ll,int [][] graph,List<List<Integer>> res){
        ll.add(index);
        if(index==graph.length-1){
            res.add(new ArrayList<>(ll));
            return;
        }

        for(int i = 0; i < graph[index].length; i++){
        dfs(graph[index][i],ll,graph,res);
        ll.remove(ll.size()-1);
        }
    }
}