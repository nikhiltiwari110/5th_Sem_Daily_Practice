class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int lo = 1;
      int hi = Arrays.stream(piles).max().getAsInt();
      int ans = 0;
      while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(isitpossible(piles,mid,h)){
            ans = mid;
            hi=mid-1;
        }else{
            lo = mid+1;
        }
      }
      return ans;  
    }
    public static boolean isitpossible(int [] arr, int mid, int h){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total+=arr[i]/mid;
            if(arr[i]%mid!=0){
                total++;
            }
            if(total>h){
                return false;
            }
        }
        return true;
    }
}