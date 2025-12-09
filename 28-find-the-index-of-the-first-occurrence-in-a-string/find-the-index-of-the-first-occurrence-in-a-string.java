class Solution {
    public int strStr(String haystack, String needle) {
        int j = needle.length();
        for(int i = 0; i <= haystack.length() - j;i++){
            if(haystack.substring(i,i+j).equals(needle)){
                    return i;
                }
            }
            return -1;
        }
    }