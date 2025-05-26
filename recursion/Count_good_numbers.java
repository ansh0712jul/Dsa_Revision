class Solution {

    private static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {

        long even =(n+1)/2;
        long odd = n/2;

        long evenPower = Power(5 , even);
        long oddPower = Power(4 , odd);
        return (int)((evenPower * oddPower) % MOD);

      
        
    }

    // fast exponention method to calculate long powers 
    // a^b = {
    //     (a ^ b/2 )^2 if b is even
    //     a *(a ^ b/2 )^2  if b is odd
    // }

    public static long Power( long a , long b ) {

        if(b == 0) return 1;

        long half = Power(a , b/2);
        long result = (half * half)  % MOD;
        if(b % 2 == 1) result = (result*a)  % MOD;

        return result;
    }
}