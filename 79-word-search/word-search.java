class Solution {
    public boolean exist(char[][] board, String word) {
        boolean find = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j]==word.charAt(0)){
                   boolean x = search(board,word,i,j,0);
                    if(x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean search(char [][] board, String word, int i, int j, int k){
        if(k==word.length()) return true;
        if(i<0||j<0||i>=board.length || j>=board[i].length){
            return false;
        }
        if(word.charAt(k)!=board[i][j]) return false;
        board[i][j] = '*';
        boolean right = search(board,word,i,j+1,k+1);
        boolean left = search(board,word,i,j-1,k+1);
        boolean up = search(board,word,i-1,j,k+1);
        boolean down = search(board,word,i+1,j,k+1);
        if(right||left||up||down) return true;
        
        board[i][j] = word.charAt(k);
        return false;

    }
}