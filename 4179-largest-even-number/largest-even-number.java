class Solution {
    public String largestEven(String s) {
        String str = "";
        int index = -1;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i)=='2'){
                index = i;
                break;
            }
        }
        if(index==-1){
            return "";
        }
        str = s.substring(0,index+1);
        return str;
    }
}