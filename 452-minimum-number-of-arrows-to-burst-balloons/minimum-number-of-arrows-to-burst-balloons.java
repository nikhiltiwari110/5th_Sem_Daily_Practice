class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int [] p = points[0];
        int pe = p[1];
        for(int i = 1; i < points.length; i++){
            //is prev end in range with ce and cs
            int [] ca = points[i];
            int cs = ca[0];
            int ce = ca[1];
             if(pe<cs){
                pe = ce;
                count++;
            }
        }
        return count;
    }
}