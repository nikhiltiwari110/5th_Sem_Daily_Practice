class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }

        for(char ch:map2.keySet()){
            if(map1.containsKey(ch)){
                int v1 = map1.get(ch);
                int v2 = map2.get(ch);
                if(v1!=v2){
                    return ch;
                }
            }else{
                return ch;
            }
        }
        return 'q';
    }
}