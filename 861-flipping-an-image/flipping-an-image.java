class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0 ; i < image.length; i++){
            //reverse the array
            int j =0;
            int k = image[i].length-1;
            while(j<k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            for(j = 0; j < image[i].length; j++){
                image[i][j] = image[i][j]^1;
            }
        }
        return image;
    }
}