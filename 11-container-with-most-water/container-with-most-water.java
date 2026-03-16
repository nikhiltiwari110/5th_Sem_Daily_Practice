class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int maxArea = 0;
        int area = 0;
        while(lo<hi){
            int dist = hi - lo;
            int h = Math.min(height[lo],height[hi]);
            area = h * dist;
            maxArea = Math.max(maxArea,area);
            if(height[lo]<height[hi]) lo++;
            else hi --;
        }
        return maxArea;
    }
}