class Solution {
    public String interpret(String command) {
        String s = "";
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i)=='G'){
                s += "G";
            }else if(command.charAt(i)=='a'){
                s += "a";
            }else if(command.charAt(i)=='l'){
                s += "l";
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
                s += "o";
                i++;
            }
        }
        return s;
    }
}