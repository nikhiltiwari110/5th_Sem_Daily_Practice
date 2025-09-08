class Solution {
    public String reverseVowels(String s) {
        List<Character> ll = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isvowel(ch)){
                ll.add(ch);
            }
        }
        Collections.reverse(ll);
        String str = "";
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            if(isvowel(ch)){
                str += ll.get(idx);
                idx++;
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