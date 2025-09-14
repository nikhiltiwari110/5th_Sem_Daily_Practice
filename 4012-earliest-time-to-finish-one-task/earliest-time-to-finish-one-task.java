class Solution {
    public int earliestTime(int[][] tasks) {
        int time = Integer.MAX_VALUE;
        for(int i = 0; i < tasks.length; i++){
            int s = tasks[i][0];
            int t = tasks[i][1];
            int total = s+t;
            if(total<time){
                time = total;
            }
        }
        return time;
    }
}