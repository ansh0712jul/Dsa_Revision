package Backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = wordSearch(board , i ,j , word , 0);
                    if(ans) return true;
                }
            }
        }
        return false;
    }

    public static boolean wordSearch(char board[][] , int cr , int cc , String word , int indx){

        if(indx == word.length()) return true;

        // base case 
        if(cc < 0 || cr < 0 || cc >= board[0].length || cr >= board.length || board[cr][cc] != word.charAt(indx))
        {
            return false;
        }

        // blocl the cell
        board[cr][cc] = '*';

        int r[] = {-1, 1, 0, 0};
        int c[] = {0, 0, -1, 1};

        for(int i=0; i<r.length; i++){
            boolean ans = wordSearch(board , cr+r[i], cc+c[i] , word , indx+1);
            if(ans) return true;

        }
        board[cr][cc] = word.charAt(indx);
        return false ;
    }
}
