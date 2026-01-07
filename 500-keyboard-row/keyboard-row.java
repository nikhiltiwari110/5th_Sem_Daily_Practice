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
            int v = 0;
            boolean flag = false;
            for(int i = 0; i < str.length(); i++){
                if( v!=1 && v!= 2 && s1.contains(str.charAt(i)) ){
                    v = -1;
                }else if( v!= 2 && v!= -1 && s2.contains(str.charAt(i)) ){
                    v = 1;
                }else if( v!=1 && v!= -1 && s3.contains(str.charAt(i)) ){
                    v = 2;
                }else{
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