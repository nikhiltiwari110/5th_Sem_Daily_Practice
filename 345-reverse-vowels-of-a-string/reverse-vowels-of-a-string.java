class Solution {
    public String reverseVowels(String s) {
        String vowels = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isvowel(ch)){
                vowels+=ch;
            }
        }
        String str = "";
        int idx = vowels.length()-1;
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            if(isvowel(ch)){
                str += vowels.charAt(idx);
                idx--;
            } else{
                str += s.charAt(i);
            }
        }
        return str;
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}