

package codeforces;

import java.util.Scanner;

public class Count_Good_Substrings {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        count_Good_String(s);
         
    }

    public static void count_Good_String(String s) {
        long arr[][] = new long[2][2];
        long odd = 0 , even = 0 ;

        for(int i=1; i<s.length(); i++){
            odd++;  
            if(i%2 != 0){
                char ch = s.charAt(i-1);
                odd += arr[ch-'a'][0]; // odd - odd +1 = odd
                arr[ch-'a'][0]++;
                even += arr[ch-'a'][1]; // odd - even +1 = even
            }
            else {
                char ch = s.charAt(i-1);
                odd += arr[ch-'a'][1]; //even - even + 1 = odd
                arr[ch-'a'][1]++;
                even += arr[ch-'a'][0]; // odd - even + 1 = even

            }
        }
        System.out.println( even + " " + odd);
    }
}
