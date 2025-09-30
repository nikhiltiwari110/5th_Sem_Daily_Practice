class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set1 = new HashSet<>();
        int [] f = new int [128];
        int si = 0;
        int ei = 0;
        int max = 0;
        while(ei<s.length()){
            //check for repeating character
            // while(set1.contains(s.charAt(ei))){
            //     set1.remove(s.charAt(si));
            //     si++;
            // }
            while(f[s.charAt(ei)]>0){
                f[s.charAt(si)]--;
                si++;
            }
            //add substring
            // set1.add(s.charAt(ei));
            f[s.charAt(ei)]++;
            //remove repeating character
            // int len = set1.size();
            int len = ei - si + 1;
            max = Math.max(max,len);
            ei++;
        }
        return max;
    }
}