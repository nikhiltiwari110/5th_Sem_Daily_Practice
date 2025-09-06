class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
     
     for(int i = left; i <= right; i++){
     boolean flag = false;
        for(int j = 0; j < ranges.length; j++){
            if(i>=ranges[j][0]&&i<=ranges[j][1]){
                flag = true;
                break;
            }
        }
        if(flag==false){
            return false;
        }
     }
     return true;
    }
}