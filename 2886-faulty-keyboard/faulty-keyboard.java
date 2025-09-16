class Solution {
    public String finalString(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='i'){
                ans = reverse(ans);
            }else{
                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
    public String reverse(String ans){
        int j = ans.length()-1;
        String res = "";
        for(int i = j; i >= 0; i--){
            res += ans.charAt(i);
        }
        return res;
    }
}