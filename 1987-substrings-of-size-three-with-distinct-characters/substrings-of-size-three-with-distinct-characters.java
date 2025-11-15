class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        HashMap<Character,Integer> set = new HashMap<>();
        int st = 0;
        int e = 0;
        for(; e < 3; e++){
            char ch = s.charAt(e);
            if(!set.containsKey(ch)){
                set.put(ch,1);
            }else{
                set.put(ch,set.get(ch)+1);
            }
        }
        int c = 0;
        if(set.size()==3){
            c++;
        }
        while(e<s.length()){
            if(!set.containsKey(s.charAt(e))){
                set.put(s.charAt(e),1);
            }else{
                set.put(s.charAt(e),set.get(s.charAt(e))+1);
            }
            int v = set.get(s.charAt(st))-1;
            if(v==0){
            set.remove(s.charAt(st));
            }else{
                set.put(s.charAt(st),set.get(s.charAt(st))-1);
            }
            st++;
            if(set.size()==3){
                c++;
            }
            e++;
        }
        return c;
    }
}