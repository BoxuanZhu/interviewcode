public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean rst = false;
        for(int i = 0; i < board.length && rst == false; i ++){
            for(int j = 0; j < board[0].length && rst == false; j++){
                if(board[i][j] == word.charAt(0))
                    rst = helper(board, i,j, 0, word);
            }
        }
        return rst;
    }
    
    private boolean helper (char[][]  board, int i, int j, int start, String word){
        if(start == word.length())
            return true;
        if(i< 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(start))
            return false;
        board[i][j] = '#';
        boolean rst = (helper(board, i+1,j, start +1, word)||helper(board, i-1,j, start +1, word)||
            helper(board, i,j+1, start +1, word)||helper(board, i,j-1, start +1, word));
        board[i][j] = word.charAt(start);
        return rst;
    }
}