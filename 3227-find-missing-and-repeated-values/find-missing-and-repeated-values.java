class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int [] a = new int[n*n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int v = grid[i][j] -1;
                a[v]++;
            }
        }
        int [] ans = new int[2];
        for(int i = 0;i < a.length; i++){
            int x = a[i];
            if(x == 0){
                ans[1] = i+1;
            }else if(x == 2){
                ans[0] = i+1;
            }
        }
        return ans;
    }
}