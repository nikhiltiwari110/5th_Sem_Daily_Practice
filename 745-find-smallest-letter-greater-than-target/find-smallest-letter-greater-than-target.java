class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int pointer = -1;
        for(int i = 0; i < letters.length; i++){
            if(letters[i]>target){
                pointer = i;
                break;
            }
        }
        if(pointer==-1){
            return letters[0];
        }else{
            return letters[pointer];
        }
    }
}