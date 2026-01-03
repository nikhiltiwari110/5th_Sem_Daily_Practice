class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,List<String>> graph = new HashMap<>();
        graph.put(beginWord,new ArrayList<String>());
        for(int i = 0; i < wordList.size(); i++){
            graph.put(wordList.get(i),new ArrayList<String>());
        }
        if(!graph.containsKey(endWord)){
           return 0;
        }
        for(String s : graph.keySet()){
            for(int i = 0; i < s.length(); i++){
                //change the ith character
                fun(i,s,graph);
            }
        }
        //bfs to find shortest path
        Queue<Pair> q = new LinkedList<>();
        int c = 0;
        HashSet<String> visited = new HashSet<>();
        q.add(new Pair(beginWord,0));
        while(!q.isEmpty()){
            //remove
            Pair pp = q.poll();
            String st = pp.demo;
            //ignore if already
            if(visited.contains(st)){
                continue;
            }
            //mark visited
            visited.add(st);
            //self work
            if(st.equals(endWord)){
                return pp.step+1;
            }
            for(String se : graph.get(st)){
                if(!visited.contains(se)){
                    q.add(new Pair(se,pp.step+1));
                }
            }
        }
        return 0;
    }
    public void fun(int index, String s , HashMap<String,List<String>> graph){
        for(char ch = 'a'; ch < s.charAt(index); ch++){
            String sr = s.substring(0,index) + ch + s.substring(index+1,s.length());
            if(graph.containsKey(sr)){
                graph.get(sr).add(s);
                graph.get(s).add(sr);
            }
        }
        for(char ch = (char)((int)s.charAt(index)+1); ch <= 'z'; ch++ ){
            String sr = s.substring(0,index) + ch + s.substring(index+1,s.length());
            if(graph.containsKey(sr)){
                graph.get(sr).add(s);
                graph.get(s).add(sr);
            }
        }
    }
    public class Pair{
        int step;
        String demo;
        public Pair(String _demo,int _step ){
            step = _step;
            demo = _demo;
        }
    }
}