class Solution {
    public void reverseString(char[] s) {
        fun(0,s.length-1,s);
    }
    public void fun(int start, int end, char [] s){
        if(start>end){
            return;
        }
        //swap

        char ch = s[start];
        s[start] = s[end];
        s[end] = ch;
        fun(start+1,end-1,s);
    }
}