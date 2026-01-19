class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int [] arr = {-1,-1};
        int max = -1;
        int x = center[0];
        int y = center[1];
        for(int [] a : towers){
            int x1 = a[0];
            int y1 = a[1];
            int q = a[2];
            if((Math.abs(x1-x)+Math.abs(y1-y))<=radius){
                if(q>max){
                    arr[0] = x1;
                    arr[1] = y1;
                }else if(q==max){
                    if(arr[0]>x1){
                        arr[0] = x1;
                        arr[1] = y1;
                    }else if(arr[0] == x1){
                        arr[1] = Math.min(y1,arr[1]);
                    }
                }
                max = Math.max(max,q);
            }
        }
        return arr;
    }
}