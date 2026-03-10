class Solution {
    public int compress(char[] chars) {
        if(chars.length==1) return 1;
        String s = "";
        // s += ch;
        int len = 1;
        int idx = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i]==chars[i-1]) len++;
            else{
                s += chars[i-1];
                if(len!=1)
                s += len;
                len = 1;
            }
        }
        s += chars[chars.length-1];
        if(len!=1) s += len;
        // System.out.println(s);
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            chars[i] = ch;
        }
        return s.length();
    }
}