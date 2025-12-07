class Solution {
    public int countOdds(int low, int high) {
        int d = high - low + 1;
        if(d%2==0){
            return d/2;
        }else{
            if(low%2==0){
                return d/2;
            }else{
                return d/2 + 1;
            }
        }
    }
}