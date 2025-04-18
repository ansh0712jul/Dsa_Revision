package String;

import java.util.Arrays;

// Approach to solve it 

// sbse pehle length should be same
// each character of word1 should be in word2
// frequencies match krni chhaiye bhai

public class Determine_if_Two_Strings_Are_Close {
    public static void main(String[] args) {

        System.out.println( closeStrings("cabbba", "abbccc"));
        
    }

    public static boolean closeStrings(String word1, String word2) {

        if( word1.length() != word2.length()) return false;

        // size check ho gya ab kisi pr bhi loop laga lo 
        int [] s1 = new int[26];
        int [] s2 = new int[26];

        for(int i=0; i<word1.length(); i++) {
            char ch1 , ch2;
            ch1 = word1.charAt(i);
            ch2 = word2.charAt(i);

            s1[ch1 - 'a']++;
            s2[ch2 - 'a']++;
        }

        for( int i=0; i<26; i++) {

            if( (s1[i] != 0 && s2[i] != 0) || (s1[i] == 0 && s2[i] == 0) ) continue;
            else return false;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals( s1 , s2 );
        
    }
}
