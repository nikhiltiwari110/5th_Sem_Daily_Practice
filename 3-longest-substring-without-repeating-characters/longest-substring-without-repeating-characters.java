class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set1 = new HashSet<>();
        int si = 0;
        int ei = 0;
        int max = 0;
        while(ei<s.length()){
            //check for repeating character
            while(set1.contains(s.charAt(ei))){
                set1.remove(s.charAt(si));
                si++;
            }
            //add substring
            set1.add(s.charAt(ei));
            //remove repeating character
            int len = set1.size();
            max = Math.max(max,len);
            ei++;
        }
        return max;
    }
}