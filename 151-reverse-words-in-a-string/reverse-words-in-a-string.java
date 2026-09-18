class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int n = s.length();
        int j = 0;
        while(j<n){
            while(j<n && s.charAt(j) == ' ') j++;
            String temp = "";
            while(j<n && s.charAt(j) != ' ') {
                temp = temp + s.charAt(j);
                j++;
            }
            ans  = " " + temp  +ans;
        }
        return ans.trim();
    }
}