class Solution {
    public String generateTag(String caption) {
       String e = "";
       for(int i = 0; i < caption.length(); i++){
        if(caption.charAt(i)!=' '){
            e += caption.charAt(i);
        }
       }
       if(e.length()==0){
        return "#";
       }else{
        String[] srv = caption.trim().split("\\s+");


         String st = srv[0].toLowerCase();
       for(int i = 1; i< srv.length;i++){
        String s1 = "" + srv[i].charAt(0);
        String s2 = srv[i].substring(1).toLowerCase();
        s1 = s1.toUpperCase();
        s1 += s2;
        st+=s1;
       }
       if(st.length()>=100){
        return ("#"+st).substring(0,100); 
       }
       return "#"+st;
       }
      
    }
}