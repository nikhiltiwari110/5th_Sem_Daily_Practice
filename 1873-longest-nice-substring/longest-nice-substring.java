class Solution {
    public String longestNiceSubstring(String s) {
        String max = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j <= s.length(); j++){
                String str = s.substring(i,j);
                if(isnice(str) && str.length()>max.length()){
                    max = str;
                }
            }
        }
        return max;
    }
    public boolean isnice(String temp){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < temp.length(); i ++){
            set.add(temp.charAt(i));
        }
        for(int i = 0; i < temp.length(); i ++){
            char ch = temp.charAt(i);
            int v = ch;
            if(ch>=65&&ch<=90){
                if(!set.contains((char)(v+32))){
                    return false;
                }
            }else{
                if(!set.contains((char)(v-32))){
                    return false;
                }
            }
        }
        return true;
    }
}