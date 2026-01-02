/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
         if(node == null){
                return node;
            }
        HashMap<Node,Node> g = new HashMap<>();
        Stack<Node> st = new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
            //remove
            Node n = st.pop();
            //ignore if already visited
            if(g.containsKey(n)){
                continue;
            }
            //mark visited
            g.put(n,new Node(n.val));

            //add nbrs
            for(Node el : n.neighbors){
                if(!g.containsKey(el)){
                    st.push(el);
                }
            }
        }
        for(Node k : g.keySet()){
            List<Node> ng = k.neighbors;
            List<Node> cng = g.get(k).neighbors;
            for(Node x : ng){
                cng.add(g.get(x));
            }
        }
        return g.get(node);
    }
}