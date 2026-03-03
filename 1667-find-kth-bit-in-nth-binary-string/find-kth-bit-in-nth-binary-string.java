class Solution {
    public char findKthBit(int n, int k) {
        // StringBuilder ans = new StringBuilder("");
        String ans = "";
        //build string
        ans = build(n,ans);
        // for(int i = 2; i <= n; i++){
        //     ans.append("1"+inverse(ans));
        // } 
        return ans.charAt(k-1); 
        
    }
    public String build(int n,String ans){
        if(n == 1) return "0";
        String l = build(n-1,ans);
        return l+"1"+inverse(l);

    }
    public String inverse(String ans){
        StringBuilder res = new StringBuilder("");
        for(int i = ans.length()-1;i>=0;i--){
            if(ans.charAt(i)=='0'){
                res.append("1");
            }else{
                res.append("0");
            }
        }
        return res.toString();
    }
}