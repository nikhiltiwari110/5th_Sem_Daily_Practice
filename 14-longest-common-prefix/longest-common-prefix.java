class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i = 1;i<strs.length;i++){
            s = compare(s,strs[i]);
        }
        return s;
    }
    public String compare(String s1, String s2){
        String s ="";
        int i = 0;
        while(i<s1.length()&&i<s2.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }else{
                s += s1.charAt(i);
            }
            i++;
        }
        return s;
    }
}