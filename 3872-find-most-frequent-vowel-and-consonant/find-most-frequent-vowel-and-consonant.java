class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int v_max = 0;
        int c_max = 0;
        for(int i = 0; i < s.length() ; i++){
            if(isvowel(s.charAt(i))){
                int x = map.get(s.charAt(i));
                if(x>v_max){
                    v_max = x;
                }
            }else{
                int x = map.get(s.charAt(i));
                if(x>c_max){
                    c_max = x;
                }
            }
        }
        return c_max+v_max;
    }
    public static boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}