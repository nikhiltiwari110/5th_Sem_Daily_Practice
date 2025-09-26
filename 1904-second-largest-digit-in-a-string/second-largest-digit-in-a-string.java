class Solution {
    public int secondHighest(String s) {
        int max1= -1;
        int max2 = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<= '9'){
            int c = s.charAt(i) - '0';
            if(c>max1){
                max2 = max1;
                max1 = c;
            }else if(c>max2&&c!=max1){
                max2 = c;
            }
            }
        }
        return max2;
        
    }
}