import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
        int [] arr1 = new int[26];
        for(int i = 0; i < s.length(); i++){
            int x = (int)s.charAt(i)-97;
            arr1[x]++;
            int y = (int)t.charAt(i)-97;
            arr1[y]--;
        
        }
        for(int el : arr1){
            if(el!=0){
                return false;
            }
        }
        return true;
        }
    }
}