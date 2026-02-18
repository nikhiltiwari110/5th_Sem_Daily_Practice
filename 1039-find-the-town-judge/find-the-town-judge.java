class Solution {
    public int findJudge(int n, int[][] trust) {
     int [] in = new int[n];// ith person ko kitne jne trust kr rhe hai'
     int [] out = new int[n]; // ith person kitne jno ko trust kr rha hai
     for(int i = 0; i < trust.length; i++){
        int u = trust[i][0]-1;
        int v = trust[i][1]-1;
        in[v]++;
        out[u]++;
     }
        for(int i = 0; i < n; i++){
            if(out[i]==0 && in[i] == n-1){
                return i+1;
            }
        }
        return -1;
    }
}