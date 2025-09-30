class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll = new ArrayList<>();
        int si = 0;
        int ei = p.length()-1;
        int [] freq_p = new int[26];
        int [] freq_w = new int[26];
        if(s.length()<p.length()){
            return ll;
        }
        for(int i = 0 ; i < p.length();i++){
            freq_p[p.charAt(i)-'a']++; //freq for string
            freq_w[s.charAt(i)-'a']++; //freq for window
        }
        if(Arrays.equals(freq_p,freq_w)){
                ll.add(si);
            }
        while(ei<s.length()-1){
            
            //update freq
            freq_w[s.charAt(si)-'a']--;
            si++;
            ei++;
            freq_w[s.charAt(ei)-'a']++;
            if(Arrays.equals(freq_p,freq_w)){
                ll.add(si);
            }
        }
        return ll;
    }
}