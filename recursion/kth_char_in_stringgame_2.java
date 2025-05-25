class Solution {
    public char kthCharacter(long k, int[] operations) {

        return ans(k , operations);
        
    }

    public static  char ans( long k ,  int arr[]) {

        if(k == 1) return 'a';

        long len = 1;
        long newK = k ;
        int opernType = arr[0];

        for( int i=0; i<arr.length; i++) {
            len *= 2;
            if(len >= k) {
                opernType = arr[i];
                newK = k - len/2;
                break;
            }
        }

        char res = ans( newK , arr );

        if (opernType == 0) return res;
        if(res == 'z') return 'a';

        return (char) (res + 1);
    }

    
}



/*logic 
calculate len of string having atleast k characters 
then 
if op == 0  kth char would be  (k - len/2)th character 

if op == 1  kth char would be  (char)((k - len/2)+ 1) character
*/