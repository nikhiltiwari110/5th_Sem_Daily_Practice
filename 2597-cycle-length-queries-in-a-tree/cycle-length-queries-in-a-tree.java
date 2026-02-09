class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int [] ans = new int[queries.length];
        int idx = 0;
        for(int [] a : queries){
            int x = a[0];
            int y = a[1];
            int lx = find(x);
            int ly = find(y);
            int common = 1;
            HashSet<Integer> ancestors = new HashSet<>();
            while(x>0){
               ancestors.add(x);
                x = x/2;
            }
            while(y>0){
                if(ancestors.contains(y)){
                    common = y;
                    break;
                }
                ancestors.add(y);
                y = y/2;
            }
            int lc = find(common);
            ans[idx++] = 1+(lx-lc)+(ly-lc);
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