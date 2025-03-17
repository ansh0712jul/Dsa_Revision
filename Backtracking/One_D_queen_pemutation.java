package Backtracking;
public class One_D_queen_pemutation {
    public static void main(String[] args) {
        int n = 4;
        int totalQueen = 2;
        int qpsf = 0;
        boolean board[] = new boolean[n];
        permutation(board , qpsf , totalQueen , n , "");
    }
    public static void permutation(boolean board[] , int qpsf , int totalQueen , int n, String ans){

        if(qpsf == totalQueen){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<board.length; i++){

            if(board[i] == false){
                board[i] = true;
                permutation(board, qpsf+1, totalQueen, n, ans + "b" + i + "q" + qpsf );
                board[i] = false;
            }
        }
    }
}
