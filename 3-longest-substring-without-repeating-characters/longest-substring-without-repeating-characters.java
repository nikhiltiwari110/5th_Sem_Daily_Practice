class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int si = 0;
        int ei = 0;
        int n = s.length();
        int ans = 0;
        while(ei<n){
            while(set.contains(s.charAt(ei))){
                set.remove(s.charAt(si));
                si++;
            }
            set.add(s.charAt(ei));
            int len = set.size();
            ans = Math.max(len,ans);
            ei++;
        }
        return ans;
    }
}