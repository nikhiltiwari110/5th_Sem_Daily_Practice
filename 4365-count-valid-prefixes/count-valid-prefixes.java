class Solution {
    public int countValidPrefixes(String s) {
        int c = 0;
        int one = 0;
        int zero = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                zero++;
            }else{
                one++;
            }
            if(Math.abs(zero-one)<=1){
                c++;
            }
        }
        return c;
    }
}