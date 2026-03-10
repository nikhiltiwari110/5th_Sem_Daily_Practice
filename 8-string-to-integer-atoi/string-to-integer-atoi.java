class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        long result = 0;
        int i = 0;
        if(s.equals("")) return 0;
        if(s.charAt(i)=='-'){
            sign = -1;
            i = 1;
        }else if(s.charAt(i)=='+'){
            i = 1;
        }
        for(; i < s.length();i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                return (int)result*sign;
            }
            int n = s.charAt(i)-'0';
            result = result*10 + n;
            if(sign == -1 && result>Integer.MAX_VALUE) {result = Integer.MAX_VALUE;
            result++;
            }
            if(sign == 1 && result>=Integer.MAX_VALUE) result = Integer.MAX_VALUE;

        } 
        return (int)result*sign;
    }
}