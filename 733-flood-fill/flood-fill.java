class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        dfs(image,sr,sc,color,original);
        return image;
    }
    public void dfs(int [][] image,int r, int c, int color,int original){
        if(r < 0 || r>= image.length || c < 0 || c >= image[0].length || image[r][c] != original || image[r][c] == color) return;
        image[r][c] = color;
        dfs(image,r+1,c,color,original);
        dfs(image,r,c+1,color,original);
        dfs(image,r,c-1,color,original);
        dfs(image,r-1,c,color,original);

    }
}