class Solution {
    public int firstMatchingIndex(String s) {
        int i = 0;
        int e = s.length()-1;
        while(i<=e){
            if(s.charAt(i)==s.charAt(e)){
                return i;
            }
            i++;
            e--;
        }
        return -1;
    }
}