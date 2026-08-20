class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0; i < drones.length; i++){
            int x1 = drones[i][0];
            int y1 = drones[i][1];
            int range = drones[i][2];
            int dis = Math.abs(x1-target[0])+Math.abs(y1-target[1]);
            if(dis<=range && dis<min){
                min = dis;
                idx = i;
            }
        }
        return idx;
    }
}