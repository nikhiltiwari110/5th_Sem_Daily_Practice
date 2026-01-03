class Solution {
    public int findChampion(int n, int[][] edges) {
        int [] in = new int[n];
        for(int [] e : edges){
            in[e[1]]++;
        }
        int c = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            if(in[i] == 0){
                c++;
                index = i;
            }
        }
        if(c==1){
            return index;
        }else{
            return -1;
        }
    }
}