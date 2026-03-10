class Solution {
    public String longestPalindrome(String s) {
        //make all substrings
        int max = 0;
        String ans = "";
        for(int i = 0 ; i<s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String str = s.substring(i,j+1);
                int len = j - i + 1;
                if(ispalindrome(str) && len>max){
                    max = len;
                    ans = str;
                }
            }
        }
        return ans;
    }
    public boolean ispalindrome(String d){
        int si = 0;
        int ei = d.length()-1;
        while(si<ei){
            if(d.charAt(si)!=d.charAt(ei))return false;
            si++;
            ei--;
        }
        return true;
    }
}