package Backtracking;

public class One_D_queen_Combination {

    public static void main(String[] args) {
        
        int n = 4;
        int totalQueen = 2;
        int qpsf = 0;
        boolean board[] = new boolean[n];
        combination(board , qpsf , totalQueen , n , "" , 0);
    }

    public static void combination(boolean board[] , int qpsf , int totalQueen , int n, String ans, int indx){

        if(qpsf == totalQueen){
            System.out.println(ans);
            return;
        }

        for(int i=indx; i<board.length; i++){

            if(board[i] == false){
                board[i] = true;
                combination(board, qpsf+1, totalQueen, n, ans + "b" + i + "q" + qpsf, indx);
                board[i] = false;
            }
        }
    }

    
}
