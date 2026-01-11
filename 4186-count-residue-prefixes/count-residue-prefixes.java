class Solution {
    public int residuePrefixes(String s) {
        int c =0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
            int v = set.size();
            if(v == (i+1)%3){
                c++;
            }
        }
        return c;
    }
}