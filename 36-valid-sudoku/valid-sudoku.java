class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                if(board[i][j]!='.'){
                    char ch = board[i][j];
                    if(!isitsafe(board,i,j,ch)){
                        return false;
                    }
                }
            }
        }
        return true;}

        public boolean isitsafe(char[][] board, int cr, int cc,char ch){
            //check for this row
            for(int col = cc+1; col < board[0].length;col++){
                if(board[cr][col]==ch){
                    return false;
                }
            }
            //check for this col
            for(int row = cr+1; row < board.length; row++){
                if(board[row][cc]==ch){
                    return false;
                }
            }
            //check for this 3x3 box
            int b_r = cr - cr%3;
            int b_c = cc - cc%3;
            for(int row = b_r; row < b_r+3; row++){
                for(int col = b_c; col < b_c+3; col++){
                    if(board[row][col]==ch&&row!=cr&&col!=cc){
                        return false;
                    }
                }
            }
            return true;
        }
}