class Solution {
    public String reverseWords(String s) {
        String [] word = s.split(" ");
        int c = count(word[0]);
        for(int i = 1;i < word.length; i++){
            if(c==count(word[i])){
                //reverse word[i]
                word[i] = rev(word[i]);
            }
        }
        String ans = "";
        for(int i = 0; i < word.length; i++){
           if(i==word.length - 1){
            ans += word[i];
           }else{
            ans += word[i]+" ";
           }
        }
        return ans;
    }
    public int count(String str){
        int e = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                e++;
            }
        }
        return e;
    }
    public String rev(String f){
        String r = "";
        for(int i = f.length()-1; i >= 0; i--){
            r += f.charAt(i);
        }
        return r;
    }
}