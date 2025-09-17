class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c = 0;
        String [] words = text.split(" ");
        for(int i = 0; i < words.length; i++){
            if(!isit(words[i],brokenLetters)){
                c++;
            }
        }
        return c;
    }
    public boolean isit(String s, String broken){
        for(int i = 0; i < broken.length(); i++){
            if(s.contains(broken.charAt(i)+"")){
                return true;
            }
        }
        return false;
    }
}