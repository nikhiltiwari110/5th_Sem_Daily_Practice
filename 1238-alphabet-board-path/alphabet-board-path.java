class Solution {
    public String alphabetBoardPath(String target) {
        int cr = 0;
        int cc = 0;
        String ans = "";
        for(int i = 0; i < target.length();i++){
            int v = target.charAt(i)-'a';
            int r = v/5;
            int c = v%5;
            int dist_r = r - cr;
            int dist_c = c - cc;
            //LDUR
            while(dist_c<0){
                    ans += "L";
                    dist_c++;
                }
            while(dist_r>0){
                    ans += "D";
                    dist_r--;
                }
            while(dist_r<0){
                    ans += "U";
                    dist_r++;
                }
            while(dist_c>0){
                    ans += "R";
                    dist_c--;
                }
            cr = r;
            cc = c;
            ans += "!";   
        }
        return ans;
    }
}