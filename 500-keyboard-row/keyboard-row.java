class Solution {
    public String[] findWords(String[] words) {
        List<String> ll = new ArrayList<>();
        HashSet<Character> s1 = new HashSet<>();
        String q = "qwertyuiop";
        for(int i = 0; i < q.length(); i++){
            char ch = q.charAt(i);
            s1.add(ch);
        }
        String a = "asdfghjkl";
        HashSet<Character> s2 = new HashSet<>();
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            s2.add(ch);
        }
        HashSet<Character> s3 = new HashSet<>();
        String z = "zxcvbnm";
        for(int i = 0; i < z.length(); i++){
            char ch = z.charAt(i);
            s3.add(ch);
        }
        for(String st:words){
            String str = st.toLowerCase();
            char ch = str.charAt(0);
            HashSet<Character> current;
            boolean flag = false;
            if(s1.contains(ch)){
                current = s1;
            }else if(s2.contains(ch)){
                current = s2;
            }else{
                current = s3;
            }
            for(int i = 1; i < str.length(); i++){
                if(!current.contains(str.charAt(i))){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ll.add(st);
            }
        }
        String [] w = new String[ll.size()];
        for(int i = 0; i < ll.size(); i++){
            w[i] = ll.get(i);
        }
        return w;
    }
}