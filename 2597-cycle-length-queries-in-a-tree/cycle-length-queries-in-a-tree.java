class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int [] ans = new int[queries.length];
        int idx = 0;
        for(int [] a : queries){
            int x = a[0];
            int y = a[1];
            int lx = find(x);
            int ly = find(y);
            int k = 0;
            int c = 0;
            while(lx>ly){
                x = x/2;
                lx--;
                c++;
            }
            while(ly>lx){
                y = y/2;
                ly--;
                c++;
            }
            while(x!=y){
                x = x/2;
                y = y/2;
                k++;
            }
            ans[idx++] = 1+c+2*k;
        }
        return ans;
    }
    public static int find(int n){
        int ans = 0;
        while(n>0){
           n = n >> 1;
           ans++;
        }
        return ans;
    }
}