class Solution {
    public int countSubstrings(String s) {
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String str = s.substring(i,j);
                String reversed = new StringBuilder(str).reverse().toString();
                if(str.equals(reversed)){
                    c++;
                }
            }
        }
        return c;
    }
}