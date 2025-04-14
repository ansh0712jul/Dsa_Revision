public class Kth_Symbol_in_Grammar {

    public static void main(String[] args) {

        int n = 5, k = 6;

        System.out.println(find(n , k));
        
    }

    public static  int find(int n , int k) {

        if( n ==1 && k == 1) return 0;

        int length = (int)Math.pow(2,n-1);
        int mid = length/2;

        if( k <= mid) return find(n-1 , k);
        else {

            // flipping the result 
            return 1-find(n-1 , k - mid);
        }
    }
    
}
