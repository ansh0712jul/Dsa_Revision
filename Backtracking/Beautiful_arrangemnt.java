public class Beautiful_arrangemnt {


    public static void main(String[] args) {

        int n = 3;
        System.out.println(new Beautiful_arrangemnt().countArrangement(n));
    }

    int total_Cnt = 0;

    public int countArrangement(int n) {

        boolean isVisited[] = new boolean[n+1];
        permute( n , isVisited , 1);

        return total_Cnt;
        
        
    }

    private void permute( int n , boolean isVisited[] , int cnt){

        if( cnt > n) {
            total_Cnt += 1;
            return ;

        }

        for( int i=1; i<=n; i++){

            if( !isVisited[i] && (i % cnt ==0 || cnt % i == 0)){

                isVisited[i] = true;
                permute(n , isVisited , cnt + 1);
                isVisited[i] = false;
            }
        }
    }

}
