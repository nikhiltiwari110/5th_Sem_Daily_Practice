class Solution {
    public boolean isLongPressedName(String name, String typed) {        
        int j = 0;
        int i = 0;
        while(i<name.length() && j<typed.length()){    
            char ch = name.charAt(i);
            int c1 = 0;
            while(i<name.length() && name.charAt(i)==ch){
                i++;
                c1++;
            }
            int c2 = 0;
            while(j<typed.length() && typed.charAt(j)==ch){
                j++;
                c2++;
            }
            if(c1>c2){
                return false;
            }
        }
        return (i==name.length()&&j==typed.length());
    }
}