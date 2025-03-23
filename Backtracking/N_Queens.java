package Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n =4;
        boolean board[][] = new boolean[n][n];

        Queen(board , 0 , n);

    }

    public static void Queen(boolean board[][]  , int row , int totalQueen){

        if(totalQueen == 0){
            display(board);
            return ;
        }

        for(int col = 0; col<board.length; col++){

            if(isItSafe(board , row , col)){
                board[row][col] = true;
                Queen(board, row+1, totalQueen-1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isItSafe(boolean board[][] , int row , int col){

        int r = row;
        // upward direction
        while(r >= 0){
            if(board[r][col] == true) return false;
            r--;
        }

        // left diagonal direction
        r = row;
        int c = col;
        while( r >= 0 && c >= 0){
            if(board[r][c] == true) return false;
            r--;
            c--;
        }

        // right diagonal direction
        r = row;
        c = col;
        while( r >= 0 && c < board.length){
            if(board[r][c] == true) return false;
            r--;
            c++;
        }
        return true;
    }

    

    public static void display(boolean board[][]){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
