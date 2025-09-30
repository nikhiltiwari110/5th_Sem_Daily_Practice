class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s2.length()<s1.length()){
        return false;
       }
       int si = 0;
       int ei = s1.length()-1;
       int [] freq_s = new int[26];
       int [] freq_w = new int[26];
       for(int i = 0; i < s1.length(); i++){
            freq_s[s1.charAt(i)-'a']++;
            freq_w[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(freq_s,freq_w)){
        return true;
       }
       while(ei<s2.length()-1){
        //update freq
        freq_w[s2.charAt(si)-'a']--;
        si++;
        ei++;
        freq_w[s2.charAt(ei)-'a']++;

        if(Arrays.equals(freq_s,freq_w)){
            return true;
        }
       }
       return false;
    
    }
}