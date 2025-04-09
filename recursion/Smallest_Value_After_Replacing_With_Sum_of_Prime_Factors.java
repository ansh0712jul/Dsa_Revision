public class Smallest_Value_After_Replacing_With_Sum_of_Prime_Factors {

    public static void main(String[] args) {

        int n = 15;
        System.out.println(find(n));
        
    }

    public static  int find( int n){
        if (isPrime(n) == true || n == 4) {
           return n;
       }

       int temp = 0;
       for (int i = 2; i <= n; i++) {
           while (n % i == 0) {
               temp = temp + i;
              n = n / i;
           }
       }

      return find(temp);
   }
   
    public static boolean isPrime(int n) {
       boolean prime = true;
       for (int i = 2; i < n; i++) {
           if (n % i == 0) {
               prime = false;
               return prime;
           }
       }
       return prime;
   }
}