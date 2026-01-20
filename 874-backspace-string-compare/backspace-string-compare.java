class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='#'&&!st1.isEmpty()){
                st1.pop();
            }else if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#' && !st2.isEmpty()){
                st2.pop();
            }else if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
        }
        String str = "";
        String ttr = "";
        while(!st1.isEmpty()){
            str += st1.pop();
        }
        while(!st2.isEmpty()){
            ttr += st2.pop();
        }
        return (str.equals(ttr));
    }
}