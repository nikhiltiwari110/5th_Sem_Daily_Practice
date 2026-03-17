class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] != 0)
                continue;
            colors[i] = 1;
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(i);
            while (!q.isEmpty()) {
                int current = q.poll();
                for (int n : graph[current]) {
                    if (colors[n] == 0) {
                        colors[n] = -colors[current];
                        q.add(n);
                    } else if (colors[n] == colors[current]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}