class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min = Integer.MAX_VALUE;
        for(int x : time){
            if(x<min){
                min = x;
            }
        }
        long lo = 1;
        long hi = (long)min*totalTrips;
        while(lo<hi){
            long mid = lo + (hi-lo)/2;
            if(isitpossible(mid,time,totalTrips)){
                hi = mid;

            }else{
                lo = mid + 1;
            }
        }
        return hi;
    }
    public boolean isitpossible(long mid,int [] time, int totaltrips){
        long total = 0;
        for(int x : time){
            total += mid/x;
        }
        if(total>=totaltrips){
            return true;
        }else{
            return false;
        }
    }
}